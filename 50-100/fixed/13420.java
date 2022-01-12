protected void onPostExecute(java.lang.Boolean result) {
    if (result != null) {
        if (result) {
            startActivity(new android.content.Intent(getActivity(), ru.guu.my.myguuruclient.TimetableActivity.class));
            getActivity().finish();
        }else {
            if (!(MainActivity.active)) {
                startActivity(new android.content.Intent(getActivity(), ru.guu.my.myguuruclient.MainActivity.class));
                getActivity().finish();
            }
            activateQRButton();
        }
    }else {
        showErrorToast("Connection error.");
        activateQRButton();
    }
}
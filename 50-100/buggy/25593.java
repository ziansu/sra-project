public void blockRotate(java.lang.Boolean bol) {
    if (bol) {
        if ((getActivity().getResources().getConfiguration().orientation) != (android.content.res.Configuration.ORIENTATION_LANDSCAPE)) {
            getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
        }else {
            getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        }
    }else {
        getActivity().setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);
    }
}
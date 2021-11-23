private void gotoMainScreen() {
    progressDialog.hide();
    getActivity().startActivity(new android.content.Intent(getContext(), com.sven.ou.module.lol.activities.MainViewActivity.class));
    getActivity().finish();
}
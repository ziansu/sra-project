private void stopLoader() {
    bindUserData(com.fiuba.tdp.linkup.services.UserManager.getInstance().getUserSelected());
    loader.clearAnimation();
    loader.setVisibility(View.GONE);
    findViewById(R.id.appbar).setVisibility(View.VISIBLE);
    nestedScrollView.setVisibility(View.VISIBLE);
}
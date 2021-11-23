public void onClickNext(java.lang.String name) {
    uiController.getTvName().setError(null);
    if (uiController.getName().equals("")) {
        uiController.getTvName().setError(getString(R.string.error_invalid_name));
    }else {
        asyncRequestRegister(name, "");
    }
}
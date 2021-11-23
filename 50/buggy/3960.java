private void showBrowser() {
    if ((!(autoLogin)) && (!(web.getUrl().contains("tas.fhict.nl/oob.html")))) {
        web.setVisibility(View.VISIBLE);
    }
}
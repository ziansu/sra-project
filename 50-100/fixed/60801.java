private void setSelected() {
    main.setSelected(false);
    devices.setSelected(false);
    about.setSelected(false);
    if ((mainFrag) != null) {
        fragmentTrs.hide(mainFrag);
    }
    if ((devicesFrag) != null) {
        fragmentTrs.hide(devicesFrag);
    }
    if ((aboutFrag) != null) {
        fragmentTrs.hide(aboutFrag);
    }
}
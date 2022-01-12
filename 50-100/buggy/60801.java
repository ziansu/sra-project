private void setSelected() {
    main.setSelected(false);
    devices.setSelected(false);
    about.setSelected(false);
    if ((mainFrag) != null) {
        fragmentTrs.hide(mainFrag);
    }
    if ((devicesFrag) != null) {
        fragmentTrs.hide(devicesFrag);
        devicesFrag.getaMap().onPause();
        devicesFrag.getaMap().onDestroy();
    }
    if ((aboutFrag) != null) {
        fragmentTrs.hide(aboutFrag);
    }
}
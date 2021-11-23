void editChannel(java.lang.String dispersyCid, java.lang.String name, java.lang.String description) {
    nameCapital.setText(org.tribler.android.MyUtils.getCapitals(name, 2));
    nameInput.setText(name);
    descriptionInput.setText(description);
    int color = org.tribler.android.MyUtils.getColor(dispersyCid.hashCode());
    org.tribler.android.MyUtils.setCicleBackground(icon, color);
    iconWrapper.setVisibility(View.VISIBLE);
    btnSave.setVisibility(View.VISIBLE);
    nameInput.setEnabled(true);
    descriptionInput.setEnabled(true);
}
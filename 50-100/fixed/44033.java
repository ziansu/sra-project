private void initializeCustomDevelopmentItems() {
    if ((devDialogListener) == null) {
        return ;
    }
    java.util.List<com.deepdroid.coredev.devdialog.uifordevdialog.CustomDevelopmentItem> customOptionsList = devDialogListener.getCustomOptionsList();
    customOptionsArea.removeAllViews();
    com.deepdroid.coredev.devdialog.DevelopmentDialog.CustomDevelopmentList customCheckList = new com.deepdroid.coredev.devdialog.DevelopmentDialog.CustomDevelopmentList(getAppCx());
    customCheckList.inflateViews(getAppCx(), customOptionsList, R.layout.item_custom_development, 0);
    customOptionsArea.addView(customCheckList);
}
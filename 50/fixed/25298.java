@java.lang.Override
public void getSelectedAppPackage(java.lang.String packageName) {
    this.packageName = packageName;
    com.shivam.invisiblewidgetspro.utils.SharedPrefHelper.setPackageNameForWidgetId(this, widgetId, packageName);
    showWidgetInformation();
    updateWidget();
}
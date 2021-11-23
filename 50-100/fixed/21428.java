private void initiateAppRelatedAdaptersAndClass() {
    packages = new com.durbinsoft.amarlauncher.ApplicationPackage(this, sPrefs);
    packages.initializePackages();
    customDrawerAdapter = new com.durbinsoft.amarlauncher.CustomApplicationDrawerAdapter(this, packages);
    appDrawerView.setAdapter(customDrawerAdapter);
    appDrawerView.setTextFilterEnabled(true);
    appDrawerClickListener = new com.durbinsoft.amarlauncher.AppDrawerClickListener(this, packages, appdrawerLongpressDetails, appDrawerView, sPrefs);
    appDrawerView.setOnItemClickListener(new com.durbinsoft.amarlauncher.AppDrawerClickListener(this, packages, sPrefs));
    appDrawerView.setOnItemLongClickListener(appDrawerClickListener);
}
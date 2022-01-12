@java.lang.Override
protected void onPostExecute(java.lang.Void result) {
    java.util.ArrayList<nickrout.lenslauncher.model.App> singletonApps = new java.util.ArrayList<>();
    singletonApps.addAll(mApps);
    nickrout.lenslauncher.util.AppsSingleton.getInstance().setApps(singletonApps);
    mUpdateAppsTaskListener.onUpdateAppsTaskPostExecute(mApps, mAppIcons);
    super.onPostExecute(result);
}
public void doLoaderStop(boolean retain) {
    mHost.doLoaderStop(retain);
    mHost.mFragmentManager.setRetainLoader(retain);
}
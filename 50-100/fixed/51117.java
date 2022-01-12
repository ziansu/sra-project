public void onFinishedLoading(java.lang.Object obj) {
    if ((contentModel.getMetadataValue("staticHeader").compareTo("true")) == 0) {
        makeHeaderStatic();
    }
    if ((contentModel.getMetadataValue("staticFooter").compareTo("true")) == 0) {
        makeFooterStatic();
    }
    entryPoint.onPageLoaded();
}
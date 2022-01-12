public void waitForJavascriptFramework() {
    if ((detectedFramework) != null)
        getFrameworkClass(detectedFramework).waitToBeReady(javascriptExecutor);
    
}
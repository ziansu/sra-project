private boolean onJsPrompt(java.lang.String methodName, java.lang.String blockName) {
    java.lang.String tag = ((((SecurityJsBridgeBundle.BLOCK) + blockName) + "-") + (SecurityJsBridgeBundle.METHOD)) + methodName;
    if (((this.mJsBridges) != null) && (this.mJsBridges.containsKey(tag))) {
        ((com.heaven.core.ui.webview.SecurityJsBridgeBundle) (this.mJsBridges.get(tag))).onCallMethod();
        return true;
    }else {
        return false;
    }
}
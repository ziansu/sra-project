public void closeIfinWindows(java.lang.Object... obj) {
    if ((window) != null) {
        window.close();
        if ((callBack) != null) {
            callBack.execute(obj);
        }
        if ((callBackList) != null) {
            for (org.shaolin.uimaster.page.ajax.CallBack caller : callBackList) {
                caller.execute(obj);
            }
        }
        callBack = null;
        callBackList = null;
    }
    this.remove();
}
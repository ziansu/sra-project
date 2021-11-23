public void closeIfinWindows(java.lang.Object... obj) {
    if ((window) != null) {
        window.close();
        this.remove();
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
}
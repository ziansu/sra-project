public void closeIfinWindows() {
    if ((window) != null) {
        window.close();
        if ((callBack) != null) {
            callBack.execute();
        }
        if ((callBackList) != null) {
            for (org.shaolin.uimaster.page.ajax.CallBack caller : callBackList) {
                caller.execute();
            }
        }
        callBack = null;
        callBackList = null;
    }
    this.remove();
}
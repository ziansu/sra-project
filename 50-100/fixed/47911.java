public void closeIfinWindows(boolean skipCallBack) {
    if ((window) != null) {
        window.close();
        this.remove();
        if (!skipCallBack) {
            if ((callBack) != null) {
                callBack.execute();
            }
            if ((callBackList) != null) {
                for (org.shaolin.uimaster.page.ajax.CallBack caller : callBackList) {
                    caller.execute();
                }
            }
        }
        callBack = null;
        callBackList = null;
    }
}
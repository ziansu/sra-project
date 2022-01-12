public boolean reset() {
    this.firstNonHmiNone = true;
    if ((proxy) != null) {
        try {
            proxy.resetProxy();
            return true;
        } catch (com.smartdevicelink.exception.SdlException e1) {
            e1.printStackTrace();
            if ((proxy) == null) {
                return false;
            }
            return true;
        }
    }else {
        return startProxy();
    }
}
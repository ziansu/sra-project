public boolean reset() {
    if ((proxy) != null) {
        try {
            proxy.resetProxy();
            this.firstNonHmiNone = true;
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
public org.json.JSONObject startVM(org.json.JSONObject vmdata) {
    try {
        java.lang.String tid = vmdata.getString("tid");
        if (tid.isEmpty()) {
            return _create_tvd(vmdata);
        }else {
            return _start_tvd(vmdata);
        }
    } catch (java.lang.Exception e) {
        return new org.json.JSONObject();
    }
}
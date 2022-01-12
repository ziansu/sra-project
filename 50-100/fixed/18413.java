public java.lang.String getStatusName() throws java.lang.Exception {
    int id = getRequestTypeId();
    if (id == 1) {
        if ((getStatus()) == 1) {
            return "получено";
        }else {
            return "не получено";
        }
    }else {
        if ((getStatus()) == 1) {
            return "доставлено";
        }else {
            return "не доставлено";
        }
    }
}
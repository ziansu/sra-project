public java.lang.String getStatusName() throws java.lang.Exception {
    int id = getRequestTypeId();
    if (id == 2) {
        if ((getStatus()) == 2) {
            return "получено";
        }else {
            return "не получено";
        }
    }else {
        if ((getStatus()) == 2) {
            return "доставлено";
        }else {
            return "не доставлено";
        }
    }
}
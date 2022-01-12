private boolean isFailed(java.util.Map<java.lang.String, java.lang.Object> resPerMessage) {
    if (resPerMessage != null) {
        return (((int) (resPerMessage.get("status"))) / 100) != 2;
    }else {
        return true;
    }
}
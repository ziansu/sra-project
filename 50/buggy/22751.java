private boolean isFailed(java.util.Map<java.lang.String, java.lang.Object> resPerMessage) {
    return (((int) (resPerMessage.get("status"))) / 100) != 2;
}
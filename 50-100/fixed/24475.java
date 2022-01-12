public void setEndPoint(final java.lang.String endPoint) {
    if ((endPoint != null) && (!(endPoint.isEmpty()))) {
        this.endPoint = (endPoint.endsWith("/")) ? endPoint.substring(0, ((endPoint.length()) - 1)) : endPoint;
    }
}
public void setEndPoint(final java.lang.String endPoint) {
    if (((endPoint != null) && (!(endPoint.isEmpty()))) && (endPoint.endsWith("/"))) {
        this.endPoint = endPoint.substring(0, ((endPoint.length()) - 1));
    }else {
        this.endPoint = endPoint;
    }
}
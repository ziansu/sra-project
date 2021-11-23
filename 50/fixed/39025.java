public void setPoint(com.jirge.server.BugaJiregeePoint point) {
    this.point = point;
    if ((this.point) != null) {
        this.point.setPiece(this);
    }
}
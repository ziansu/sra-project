public void setStart(appname.util.GregCalPlus start) {
    setDuration(appname.util.Util.safeLongToInt(appname.util.Util.getDeltaT(getStart(), getEnd())));
    this.start = start;
}
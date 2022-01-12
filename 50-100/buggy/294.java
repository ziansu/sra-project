private long generateSnapshotId() {
    if (("SNAPSHOT".equals(type.toString())) == false) {
        return -1;
    }
    if (com.google.common.base.Strings.isNullOrEmpty(this.snapshotId)) {
        return java.lang.System.currentTimeMillis();
    }else {
        return java.lang.Integer.parseInt(this.snapshotId);
    }
}
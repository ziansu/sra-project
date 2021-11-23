public void displayRecordList() {
    for (track.TrackingRow listrecord : recordlist) {
        if (!(listrecord.invalid)) {
            java.lang.System.out.println((((((((" " + (listrecord.range.hi)) + " - ") + (listrecord.range.lo)) + " -- ") + (listrecord.statusCode)) + " -- ") + (listrecord.transferCode)));
        }
    }
}
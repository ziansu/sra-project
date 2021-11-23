public void displayRecordList() {
    for (track.TrackingRow listrecord : recordlist) {
        if (!(listrecord.invalid)) {
            java.lang.System.out.println((((((((listrecord.range.lo) + " ") + (listrecord.range.hi)) + " ") + (listrecord.statusCode)) + " ") + (listrecord.transferCode)));
        }
    }
}
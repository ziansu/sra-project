@java.lang.Override
public void onAdsDataReceived(int[] dataFrame) {
    if (bdfRecordsJoiner.addDataRecord(dataFrame)) {
        try {
            bdfWriter.writeDataRecord(bdfRecordsJoiner.getResultingDataRecord());
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    }
}
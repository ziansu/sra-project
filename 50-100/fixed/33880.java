private void computeTop100RecordID() {
    if ((recordingItem) != null) {
        java.util.Iterator<logdruid.data.record.RecordingItem> rIIte = recordingItem.iterator();
        top100Index = -1;
        int count = 0;
        while ((rIIte.hasNext()) && ((top100Index) == (-1))) {
            if (rIIte.next().getProcessingType().equals("top100")) {
                top100Index = count;
            }
            count++;
        } 
    }
}
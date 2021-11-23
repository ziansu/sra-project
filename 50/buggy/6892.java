void setSelection(long trackerID) {
    if (trackerIDToSelectionIDMap.containsKey(trackerID)) {
        int item = trackerIDToSelectionIDMap.get(trackerID);
        spinner.setSelection(item, true);
    }
}
private void calculateDuration() {
    if (locations.isEmpty()) {
        metaData.duration = -1;
    }
    metaData.duration = (locations.get(((locations.size()) - 1)).getTimestamp()) - (locations.get(0).getTimestamp());
}
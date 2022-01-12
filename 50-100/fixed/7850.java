private void calculateDuration() {
    if (locations.isEmpty()) {
        metaData.duration = -1;
    }else {
        metaData.duration = (locations.get(((locations.size()) - 1)).getTimestamp()) - (locations.get(0).getTimestamp());
    }
}
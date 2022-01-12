public void onlyThree() {
    tempLatLongList.clear();
    for (int x = 0; x < (latLongList.size()); x++) {
        int size = latLongList.size();
        tempLatLongList.add(latLongList.get((((latLongList.size()) - x) - 1)));
        if (x == 3) {
            break;
        }
    }
}
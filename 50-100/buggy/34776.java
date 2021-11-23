public boolean checkInSortedOrder(java.util.List<hw3.QuakeEntry> quakes) {
    for (int a = 0; a < ((quakes.size()) - 1); a++) {
        if ((quakes.get(a).getMagnitude()) < (quakes.get((a + 1)).getMagnitude())) {
            return false;
        }
    }
    return true;
}
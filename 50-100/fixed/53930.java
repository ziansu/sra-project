public void clearPending() {
    synchronized(data) {
        for (int i = 0; i < (data.size()); i++) {
            if (((data.get(i).reqid) != (-1)) && ((data.get(i).color) == (colorScheme.timestampColor))) {
                data.remove(i);
                i--;
            }
        }
    }
}
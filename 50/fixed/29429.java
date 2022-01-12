public boolean fetchBuoyData() {
    synchronized(this) {
        if (mCurrentContainer.buoyData.isEmpty()) {
            return parseBuoyData();
        }else {
            return true;
        }
    }
}
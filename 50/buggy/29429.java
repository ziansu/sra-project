public boolean fetchBuoyData() {
    if (mCurrentContainer.buoyData.isEmpty()) {
        return parseBuoyData();
    }else {
        return true;
    }
}
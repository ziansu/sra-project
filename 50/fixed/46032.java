public com.ds.avare.place.Airport getAirport(int index) {
    if (index >= (mAirports.length)) {
        return null;
    }
    return mAirports[index];
}
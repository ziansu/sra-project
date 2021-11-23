public byte[] toByteArray(final com.yahoo.sketches.ArrayOfItemsSerDe<T> serDe) {
    if ((itemsSeen_) == 0) {
        return toByteArray(serDe, null);
    }else {
        return toByteArray(serDe, data_[0].getClass());
    }
}
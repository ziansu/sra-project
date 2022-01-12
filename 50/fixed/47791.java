public java.lang.String getCurrentSN() {
    init();
    if ((currentFaceSetID) == (-1)) {
        return getLastSNFromConfTable();
    }
    return (currentFaceSetID) + "";
}
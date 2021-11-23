public java.lang.String getArrivalOffset() {
    if ((arrivalOffset) >= 0) {
        return java.lang.String.format("%02d:%02d:%02d", ((arrivalOffset) / 3600), ((arrivalOffset) / 60), ((arrivalOffset) % 60));
    }
    return null;
}
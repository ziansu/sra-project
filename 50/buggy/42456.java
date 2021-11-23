public org.zahm.horsetrack.model.Horse findHorseWithNumber(int horseNumber) throws org.zahm.horsetrack.exception.InvalidHorseException {
    try {
        return horses.get(horseNumber);
    } catch (java.lang.Exception e) {
        throw new org.zahm.horsetrack.exception.InvalidHorseException(java.lang.Integer.toString(horseNumber));
    }
}
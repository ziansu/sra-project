public org.zahm.horsetrack.model.Horse findHorseWithNumber(int horseNumber) throws org.zahm.horsetrack.exception.InvalidHorseException {
    return horses.get(horseNumber);
}
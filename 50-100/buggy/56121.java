public static search.Genre getGenreByByteId(byte id) {
    int convertedByte = (id >= 0) ? id : ((int) (id)) + 256;
    if ((convertedByte < 0) || (convertedByte >= (search.Genre.values().length))) {
        return search.Genre.values()[0];
    }else {
        return search.Genre.values()[convertedByte];
    }
}
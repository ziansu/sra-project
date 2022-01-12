public java.lang.String toString(final boolean reducedSize) {
    if ((number) == null) {
        if (reducedSize) {
            return ((BaulastenPictureFinder.PATH_RS) + (BaulastenPictureFinder.SEP)) + (file.toUpperCase());
        }else {
            return ((BaulastenPictureFinder.PATH) + (BaulastenPictureFinder.SEP)) + (file.toUpperCase());
        }
    }else {
        return ((getFolder(number, reducedSize)) + (BaulastenPictureFinder.SEP)) + (file.toUpperCase());
    }
}
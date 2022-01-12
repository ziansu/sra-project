public lu.acel.lidderbuch.model.LBSong songWithNumber(java.lang.String number) {
    if (number == null) {
        return null;
    }
    for (lu.acel.lidderbuch.model.LBSong s : songs) {
        if ((s.getNumber()) == null) {
            continue;
        }
        if (number.toLowerCase().equals(s.getNumber().toLowerCase())) {
            return s;
        }
    }
    return null;
}
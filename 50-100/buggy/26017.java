public void setYearOfPub(int yop) throws com.mycompany.cps2002.farrugia.bonello.OutOfBoundsException {
    int thisYear = java.util.Calendar.YEAR;
    if ((yop >= 0) && (yop <= thisYear)) {
        this.yop = yop;
    }else {
        throw new com.mycompany.cps2002.farrugia.bonello.OutOfBoundsException(0, thisYear);
    }
}
public static java.lang.String getEvents(int date) {
    java.lang.String temp = "";
    java.lang.String[] x = calIO.CalFile.CalReadV2(date, false);
    for (int i = 0; i < (x.length); i++) {
        temp += (x[i]) + "\n";
    }
    return temp;
}
private java.lang.String getTimeFormat(java.lang.String input) {
    for (int i = 0; i < (cs2103_w09_1j.esther.DateParser.timeFormatList.size()); i++) {
        try {
            java.text.SimpleDateFormat timeFormat = new java.text.SimpleDateFormat(cs2103_w09_1j.esther.DateParser.timeFormatList.get(i));
            timeFormat.parse(input);
            return cs2103_w09_1j.esther.DateParser.timeFormatList.get(i);
        } catch (java.text.ParseException e) {
            continue;
        }
    }
    return "";
}
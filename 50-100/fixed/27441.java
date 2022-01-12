private java.lang.String replaceCRandLF(java.lang.String line) {
    line = line.replaceAll(CR, " ");
    line = line.replaceAll(LF, "");
    line = line.replaceAll(com.chs.drivers.DivisionalDriver.RECORD_SEPARATOR, "");
    line = line.replaceAll("~", UNIT_SEPARATOR);
    return line;
}
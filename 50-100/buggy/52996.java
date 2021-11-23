private void allRowsSameLength(java.lang.String[] body, java.lang.String header) {
     expectedLength = splitLine(header).size();
    for (java.lang.String line : body) {
        java.util.List<java.lang.String> split = splitLine(line);
        if (((split.size()) != expectedLength) && ((split.size()) != 0)) {
            errors.add(new nl.thehyve.ocdu.models.errors.FileFormatError(("Following line has different number of fields than the header:" + line)));
            valid = false;
        }
    }
}
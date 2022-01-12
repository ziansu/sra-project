private java.lang.String getMonthFolderName(java.lang.Integer monthNumber, java.lang.String monthFolderName) {
    monthNumber++;
    return (((monthNumber.toString().length()) < 2 ? "0" + monthNumber : monthNumber) + "_") + monthFolderName;
}
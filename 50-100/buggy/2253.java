private void setAllElements(java.lang.String[] resultsArray) throws java.text.ParseException {
    this.setID(java.lang.Integer.parseInt(resultsArray[0]));
    this.setName(resultsArray[3]);
    this.setStartDate(parseDate(resultsArray[1]));
    this.setEndDate(parseDate(resultsArray[2]));
    this.setPriority(java.lang.Integer.parseInt(resultsArray[4]));
    this.setCompleted(parseCompleted(resultsArray[5]));
    this.setIsValid(true);
}
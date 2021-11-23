private boolean hasPassed(int currTime2, int time, int[] date) {
    return ((((currTime2 > time) && ((date[dooyit.parser.DateTimeParser.DATE_INDEX_DD]) == (currDD))) && ((date[dooyit.parser.DateTimeParser.DATE_INDEX_MM]) == (currMM))) && ((date[dooyit.parser.DateTimeParser.DATE_INDEX_YY]) == (currYY))) && (time != (-1));
}
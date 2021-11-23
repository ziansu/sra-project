@org.junit.Test
public void allRedmineDateFormatsAreParsed() throws java.text.ParseException {
    dateIsParsedTo("2015/03/11", new java.util.Date(115, 2, 11));
    dateIsParsedTo("2015/03/11 17:22:37 -0700", "2015-03-11T17:22:37.000PDT");
    dateIsParsedTo("2015-03-11", new java.util.Date(115, 2, 11));
    dateIsParsedTo("2015-03-12T00:22:37Z", "2015-03-11T17:22:37.000PDT");
    dateIsParsedTo("2015-03-12T00:22:37.123Z", "2015-03-11T17:22:37.123PDT");
}
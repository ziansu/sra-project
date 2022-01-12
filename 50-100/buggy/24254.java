@org.junit.Test
public void parseRealCSVDataIntoMailingsForASpecificLanguages() throws java.io.IOException {
    de.aikiit.mailversendala.csv.CsvParser parser = new de.aikiit.mailversendala.csv.CsvParser(new java.io.StringReader(de.aikiit.mailversendala.csv.CsvParserTest.CSV_INPUT));
    java.util.Arrays.asList("de", "en", "ru").forEach(( language) -> {
        java.util.List<de.aikiit.mailversendala.csv.Mailing> parsedMailings = null;
        try {
            parsedMailings = parser.parse(java.util.Optional.of(language));
            org.assertj.core.api.Assertions.assertThat(parsedMailings).hasSize(1);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    });
}
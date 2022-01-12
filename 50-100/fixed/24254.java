@org.junit.Test
public void parseRealCSVDataIntoMailingsForASpecificLanguages() throws java.io.IOException {
    java.util.Arrays.asList("de", "en", "ru").forEach(( language) -> {
        try {
            de.aikiit.mailversendala.csv.CsvParser parser = new de.aikiit.mailversendala.csv.CsvParser(new java.io.StringReader(de.aikiit.mailversendala.csv.CsvParserTest.CSV_INPUT));
            org.assertj.core.api.Assertions.assertThat(parser.parse(java.util.Optional.of(language))).hasSize(1);
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
    });
}
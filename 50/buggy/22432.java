public static void main(java.lang.String... args) {
    es.uniovi.asw.parser.ReadCensus census = new es.uniovi.asw.parser.ArgumentsParser();
    census.read(args);
    java.lang.System.err.println(((es.uniovi.asw.parser.ArgumentsParser) (census)).getErrors());
}
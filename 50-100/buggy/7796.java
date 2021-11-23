@java.lang.Override
public org.bson.Document detect(java.util.List<org.repositoryminer.parser.IParser> parsers, java.lang.String repositoryPath) {
    try {
        org.bson.Document document = new org.bson.Document();
        document.append("name", "duplicated_code").append("occurences", process(parsers));
        return document;
    } catch (java.io.IOException e) {
        e.printStackTrace();
        return null;
    }
}
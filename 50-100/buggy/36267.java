private void parseAttribute(io.github.programminglife2016.pl1_2016.parser.metadata.Annotation annotation, java.lang.String data) {
    java.lang.String[] pair = data.split("=");
    switch (pair[0]) {
        case "calhounClass" :
            annotation.setCalhounClass(pair[1]);
            break;
        case "Name" :
            annotation.setName(pair[1]);
            break;
        case "ID" :
            annotation.setId(pair[1]);
            break;
        case "displayName" :
            annotation.setDisplayName(pair[1]);
            break;
    }
}
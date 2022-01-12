public static java.lang.Object parseJson(java.io.Reader jsonReader) {
    groovy.json.JsonSlurper parser = new groovy.json.JsonSlurper();
    try {
        return parser.parse(jsonReader);
    } finally {
    }
}
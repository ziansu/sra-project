public void transformResponseToJson(final org.sonar.api.utils.text.JsonWriter jsonWriter, final java.util.Map<java.lang.Integer, de.rinderle.softvis3d.domain.graph.ResultPlatform> results) {
    jsonWriter.beginObject();
    jsonWriter.name("visualizationResult");
    jsonWriter.beginArray();
    for (final java.util.Map.Entry<java.lang.Integer, de.rinderle.softvis3d.domain.graph.ResultPlatform> entry : results.entrySet()) {
        transformPlatform(jsonWriter, entry.getKey(), entry.getValue());
    }
    jsonWriter.endArray();
    jsonWriter.endObject();
    jsonWriter.close();
}
@java.lang.Override
public org.sifrproject.annotations.api.model.context.TemporalityContext getTemporalityContext() {
    com.eclipsesource.json.JsonObject tempoContext = jsonObject.get("temporalityContext").asObject();
    if (((temporalityContext) == null) && (tempoContext != null)) {
        temporalityContext = org.sifrproject.annotations.api.model.context.TemporalityContext.valueOf(tempoContext.asString());
    }
    return temporalityContext;
}
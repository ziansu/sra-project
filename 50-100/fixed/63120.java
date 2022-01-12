@java.lang.Override
public org.sifrproject.annotations.api.model.context.TemporalityContext getTemporalityContext() {
    java.lang.String tempoContext = jsonObject.get("temporalityContext").asString();
    if (((temporalityContext) == null) && (tempoContext != null)) {
        temporalityContext = org.sifrproject.annotations.api.model.context.TemporalityContext.valueOf(tempoContext);
    }
    return temporalityContext;
}
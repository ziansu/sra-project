public java.util.List<eu.h2020.symbiote.cloud.model.data.observation.Observation> readResourceHistory(java.lang.String resourceId) {
    java.util.List<eu.h2020.symbiote.cloud.model.data.observation.Observation> value = new java.util.ArrayList();
    eu.h2020.symbiote.cloud.model.data.observation.Observation obs1 = eu.h2020.symbiote.plugin.PlatformSpecificPlugin.observationExampleValue();
    eu.h2020.symbiote.cloud.model.data.observation.Observation obs2 = eu.h2020.symbiote.plugin.PlatformSpecificPlugin.observationExampleValue();
    value.add(obs1);
    value.add(obs2);
    return value;
}
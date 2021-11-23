public java.lang.String buildMessage(java.util.Map<java.lang.String, java.lang.String> parameters) {
    com.google.gson.Gson gson = new com.google.gson.Gson();
    if (parameters.containsKey(com.fhactory.outputs.lights.LightMessageBuilder.POWER_PARAM)) {
        com.fhactory.outputs.lights.LightMessageBuilder.LightMessageDto lightMessageDto = new com.fhactory.outputs.lights.LightMessageBuilder.LightMessageDto(java.lang.Boolean.valueOf(parameters.get(com.fhactory.outputs.lights.LightMessageBuilder.POWER_PARAM)));
        return gson.toJson(lightMessageDto);
    }
    return null;
}
@java.lang.Override
public java.util.Collection<com.fabiendem.defib68.models.defibrillator.DefibrillatorModel> deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
    java.util.ArrayList<com.fabiendem.defib68.models.defibrillator.DefibrillatorModel> newArray = new java.util.ArrayList<>();
    com.google.gson.JsonArray array = json.getAsJsonArray();
    for (com.google.gson.JsonElement json2 : array) {
        com.fabiendem.defib68.models.defibrillator.DefibrillatorModel object = com.fabiendem.defib68.models.defibrillator.json.DefibrillatorJsonConvertor.ConvertJsonElementToDefibrillatorModel(json2);
        newArray.add(object);
    }
    return newArray;
}
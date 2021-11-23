@java.lang.Override
public java.util.Collection<com.fabiendem.defib68.models.defibrillator.DefibrillatorModel> deserialize(com.google.gson.JsonElement json, java.lang.reflect.Type typeOfT, com.google.gson.JsonDeserializationContext context) throws com.google.gson.JsonParseException {
    java.util.ArrayList<com.fabiendem.defib68.models.defibrillator.DefibrillatorModel> newArray = new java.util.ArrayList<com.fabiendem.defib68.models.defibrillator.DefibrillatorModel>();
    com.google.gson.JsonArray array = json.getAsJsonArray();
    java.util.Iterator<com.google.gson.JsonElement> iterator = array.iterator();
    while (iterator.hasNext()) {
        com.google.gson.JsonElement json2 = iterator.next();
        com.fabiendem.defib68.models.defibrillator.DefibrillatorModel object = com.fabiendem.defib68.models.defibrillator.json.DefibrillatorJsonConvertor.ConvertJsonElementToDefibrillatorModel(json2);
        newArray.add(object);
    } 
    return newArray;
}
public com.google.gson.JsonObject toJson(li.strolch.model.Order element) {
    com.google.gson.JsonObject rootJ = new com.google.gson.JsonObject();
    rootJ.addProperty(Tags.Json.OBJECT_TYPE, Tags.Json.ORDER);
    toJson(element, rootJ);
    rootJ.addProperty(Tags.Json.DATE, formatDate(element.getDate()));
    rootJ.addProperty(Tags.Json.STATE, element.getState().getName());
    addVersion(element, rootJ);
    addParameterBags(element, rootJ);
    addPolicies(element, rootJ);
    return rootJ;
}
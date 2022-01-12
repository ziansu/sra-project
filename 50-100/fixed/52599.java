private org.json.JSONArray prepareValues(org.json.JSONArray values, org.json.JSONArray controlDataElements) throws java.lang.Exception {
    for (org.eyeseetea.malariacare.database.model.Value value : survey.getValues()) {
        values.put(prepareValue(value));
    }
    if (controlDataElements != null) {
        for (int i = 0; i < (controlDataElements.length()); i++) {
            values.put(controlDataElements.get(i));
        }
    }
    return values;
}
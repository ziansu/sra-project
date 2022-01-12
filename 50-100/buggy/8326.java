public javax.json.JsonStructure getEventDistrictPoints(java.lang.String eventKey, int verboseLevel) {
    javax.json.JsonStructure data = get((("event/" + eventKey) + "/district_points"), header);
    if (verboseLevel < 2) {
        data = ((javax.json.JsonStructure) (((javax.json.JsonObject) (data)).get("points")));
    }
    return data;
}
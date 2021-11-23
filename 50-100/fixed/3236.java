public javax.json.JsonStructure getEventOprs(java.lang.String eventKey, int verboseLevel) {
    javax.json.JsonStructure data = get((("event/" + eventKey) + "/oprs"), header);
    if ((data != null) && (verboseLevel < 2)) {
        data = ((javax.json.JsonStructure) (((javax.json.JsonObject) (data)).get("oprs")));
    }
    return data;
}
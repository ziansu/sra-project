@java.lang.Override
public javax.json.JsonObjectBuilder toJson() {
    return javax.json.Json.createObjectBuilder().add("id", md.getId()).add("outputType", "SCALAR");
}
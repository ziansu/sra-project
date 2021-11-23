@java.lang.Override
public javax.json.JsonObjectBuilder toJson() {
    return org.xcolab.util.json.NullsafeJsonObjectBuilder.of(javax.json.Json.createObjectBuilder()).add("description", getDescription()).add("displayItemType", getDisplayItemType().name()).add("widgetType", getType().name());
}
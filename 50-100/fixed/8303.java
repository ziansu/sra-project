@java.lang.Override
public javax.json.JsonObjectBuilder toJson() {
    return org.xcolab.util.json.NullsafeJsonObjectBuilder.of(super.toJson()).add("description", getDescription()).add("displayItemType", getDisplayItemType().name()).add("widgetType", getType().name());
}
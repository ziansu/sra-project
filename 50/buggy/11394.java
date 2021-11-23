@java.lang.Override
public final void load(com.google.gson.JsonObject json) {
    value = json.get(name).getAsDouble();
}
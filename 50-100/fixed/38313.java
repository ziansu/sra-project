@java.lang.Override
public java.lang.String serialize(gr.eap.RLGameEcoServer.comm.CommunicationsObject command) {
    com.google.gson.GsonBuilder builder = new com.google.gson.GsonBuilder();
    com.google.gson.Gson gson = builder.create();
    com.google.gson.JsonObject a = gson.toJsonTree(command).getAsJsonObject();
    a.add(gr.eap.RLGameEcoServer.comm.JsonCommObjectSerializer.COMMAND_TYPE_PROPERTY, new com.google.gson.JsonPrimitive(command.getClass().getName()));
    return a.toString();
}
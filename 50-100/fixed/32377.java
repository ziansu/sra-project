@java.lang.Override
public void execute(net.zencal.snuffles.domain.dubtrack.payload.DubChatPayload chatPayload) {
    net.zencal.snuffles.command.configuration.ResponseConfiguration responseConfiguration = new com.google.gson.Gson().fromJson(configurationJson.toString(), net.zencal.snuffles.command.configuration.ResponseConfiguration.class);
    java.util.Random random = new java.util.Random();
    java.lang.Integer randomInt = random.nextInt(responseConfiguration.getResponses().size());
    java.lang.String response = responseConfiguration.getResponses().get(randomInt);
    dubtrackService.sendMessage(response.replaceAll("<<username>>", chatPayload.getUser().getUsername()));
}
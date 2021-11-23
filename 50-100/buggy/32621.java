@java.lang.Override
public java.util.List<shared.classes.CommandData> execute() {
    ServerFacade._instance.initializeCities();
    ServerFacade._instance.addGameInfo(data);
    java.util.List<shared.classes.CommandData> result = new java.util.ArrayList<>();
    result.add(new shared.classes.CommandData(CommandData.Type.GAMESTARTED, ServerFacade._instance.getGameInfo(gameId)));
    return result;
}
@java.lang.Override
public void run() {
    for (model.object.agent.Agent agent : agents) {
        javafx.application.Platform.runLater(() -> {
            model.object.agent.ExplorerAgent castedAgent = ((model.object.agent.ExplorerAgent) (agent));
            castedAgent.getAlgorithm().update(castedAgent);
            tickEv.accept(agent);
        });
    }
}
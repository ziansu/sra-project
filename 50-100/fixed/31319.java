@java.lang.Override
public void run() {
    for (model.object.agent.Agent agent : agents) {
        if ((agent.getAlgorithm()) != null) {
            javafx.application.Platform.runLater(() -> {
                agent.getAlgorithm().update(agent);
                tickEv.accept(agent);
            });
        }
    }
}
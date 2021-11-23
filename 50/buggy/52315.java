@java.lang.Override
public void checkLife(ru.resolutionpoint.edu.animals.model.Environment environment) {
    if ((life) <= 0) {
        environment.deleteEntity(this);
        this.stop();
        ru.resolutionpoint.edu.animals.view.EntitiesPanel.deleteEntityView(this);
    }
}
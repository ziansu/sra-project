@java.lang.Override
public java.lang.Boolean checkLife(ru.resolutionpoint.edu.animals.model.Environment environment) {
    if ((life) <= 0) {
        environment.deleteEntity(this);
        this.stop();
        ru.resolutionpoint.edu.animals.view.EntitiesPanel.deleteEntityView(this);
        return true;
    }
    return false;
}
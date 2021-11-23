@java.lang.Override
public void menuAboutToShow(org.eclipse.jface.action.IMenuManager manager) {
    if (viewer.getSelection().isEmpty()) {
        return ;
    }
    org.eclipse.vorto.core.api.repository.ModelResource model = ((org.eclipse.vorto.core.api.repository.ModelResource) (viewer.getSelection()));
    if ((model.getId().getModelType()) == (org.eclipse.vorto.core.api.model.model.ModelType.InformationModel)) {
        addListGeneratorsToMenu(manager, model);
    }
}
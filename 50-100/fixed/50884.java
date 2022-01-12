@java.lang.Override
public boolean hasChildren(java.lang.Object parent) {
    if (parent instanceof sernet.gs.model.Baustein) {
        return ((sernet.gs.model.Baustein) (parent)).getMassnahmen().isEmpty();
    }else
        if (parent instanceof sernet.gs.ui.rcp.main.bsi.views.BSIKatalogInvisibleRoot) {
            return ((sernet.gs.ui.rcp.main.bsi.views.BSIKatalogInvisibleRoot) (parent)).getBausteine().isEmpty();
        }
    
    return false;
}
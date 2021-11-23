@java.lang.Override
public void terminate() {
    if ((this.currentContext) != null)
        this.currentContext.eAdapters().remove(visualizer);
    
    visualizer.setHighlightingSupport(org.yakindu.sct.simulation.ui.model.presenter.NULL_SUPPORT);
}
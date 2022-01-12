private es.uvigo.ei.aibench.core.ParamSpec[] getParamSpec() {
    if (this.wasCancelled)
        return null;
    
    es.uvigo.ei.aibench.core.ParamSpec[] ret = new es.uvigo.ei.aibench.core.ParamSpec[this.providers.size()];
    int i = 0;
    for (es.uvigo.ei.aibench.workbench.inputgui.ParamProvider provider : this.providers) {
        ret[(i++)] = provider.getParamSpec();
    }
    return ret;
}
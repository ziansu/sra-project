@java.lang.Override
public void alterate(java.util.List<ntr.model.IModel> elements, ntr.environement.Environement env) {
    for (ntr.model.IModel model : elements) {
        if ((model.getTag()) == (jdk.nashorn.internal.runtime.regexp.joni.Config.MOBILE_TAG));
    }
    elements.PathLossAlteration(packet, env);
}
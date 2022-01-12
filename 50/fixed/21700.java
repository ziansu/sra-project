@java.lang.Override
public org.eclipse.ice.viz.service.modeling.AbstractController getShape(int index) {
    if (((shapes) == null) || ((shapes.size()) > index)) {
        return null;
    }
    return shapes.get(index);
}
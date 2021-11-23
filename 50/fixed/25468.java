@java.lang.Override
public boolean isGui3d() {
    return (model) != null ? model.customData.gui3d : true;
}
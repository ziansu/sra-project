@java.lang.Override
public void removeNotify() {
    super.removeNotify();
    if ((this.pObj) != null) {
        this.pObj.removeLayerGroupListener(this);
    }
}
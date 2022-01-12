@java.lang.Override
public void updateProjectionObliqueValues() {
    if ((getType()) == (RendererType.GL2)) {
        updateOrthoValues();
    }
    super.updateProjectionObliqueValues();
}
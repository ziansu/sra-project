protected <T extends javafx.scene.Node> T find(final java.lang.String fxId) {
    return ((T) (lookup(fxId).queryAll().iterator().next()));
}
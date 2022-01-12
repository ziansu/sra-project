@java.lang.Override
public void dispose() {
    world.dispose();
    batch.dispose();
    shape.dispose();
    debugRenderer.dispose();
}
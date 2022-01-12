@java.lang.Override
public io.faucette.scene_graph.Component clear() {
    active = true;
    width = 960.0F;
    height = 640.0F;
    invWidth = 1.0F / (width);
    invHeight = 1.0F / (height);
    aspect = (width) / (height);
    orthographicSize = 1.0F;
    minOrthographicSize = io.faucette.math.Mathf.EPSILON;
    maxOrthographicSize = 1024.0F;
    projection = new io.faucette.math.Mat32();
    view = new io.faucette.math.Mat32();
    needsUpdate = true;
    return this;
}
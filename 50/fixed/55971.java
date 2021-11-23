public int getCameraIndex(int renderLayer) {
    if ((renderLayer < 0) || (renderLayer >= (cameraSystem.nodes.size()))) {
        return -1;
    }
    return cameraSystem.nodes.get(renderLayer).index.v;
}
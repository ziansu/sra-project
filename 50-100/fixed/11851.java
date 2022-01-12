void restore() {
    init(mVertexShader, mFragmentShader);
    init();
    mAmbientColor.refresh();
    if ((mLights) != null) {
        for (com.gplibs.magicsurfaceview.Light l : mLights) {
            l.restore();
        }
    }
    if ((mSurfaces) != null) {
        for (com.gplibs.magicsurfaceview.MagicBaseSurface<?> s : mSurfaces) {
            s.restore();
        }
    }
}
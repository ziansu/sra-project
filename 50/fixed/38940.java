public void resetGLState() {
    _currentProgram = 0;
    _currentCamera = null;
    _oldBlending = null;
    _oldDepthTest = null;
    _oldDepthWrite = null;
    _oldDoubleSided = null;
    _oldFlipSided = null;
    _currentGeometryGroupHash = -1;
    _currentMaterialId = -1;
    _lightsNeedUpdate = true;
}
public org.cocos2dx.lib.Cocos2dxGLSurfaceView onCreateView() {
    org.cocos2dx.lib.Cocos2dxGLSurfaceView glSurfaceView = new org.cocos2dx.lib.Cocos2dxGLSurfaceView(this);
    glSurfaceView.setEGLConfigChooser(8, 8, 8, 8, 16, 0);
    return glSurfaceView;
}
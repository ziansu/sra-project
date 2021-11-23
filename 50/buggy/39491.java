@java.lang.Override
protected com.baebae.reactnativecamera.CameraView createViewInstance(com.facebook.react.uimanager.ThemedReactContext context) {
    cameraView = new com.baebae.reactnativecamera.CameraView(context, cameraInstanceManager);
    cameraView.startCamera();
    return cameraView;
}
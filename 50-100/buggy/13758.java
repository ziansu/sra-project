@java.lang.Override
public void run() {
    final android.opengl.GLSurfaceView glView = new android.opengl.GLSurfaceView(com.quixom.apps.deviceinfo.utilities.GPU.context);
    glView.setEGLConfigChooser(new com.quixom.apps.deviceinfo.utilities.GPU.EglChooser<T>(info));
    glView.setZOrderOnTop(true);
    renderer = new com.quixom.apps.deviceinfo.utilities.GPU.GPURenderer<T>(glView, info, callback);
    glView.setEGLContextClientVersion(info.eGLContextClientVersion);
    glView.setRenderer(renderer);
    final android.widget.FrameLayout layout = ((android.widget.FrameLayout) (com.quixom.apps.deviceinfo.utilities.GPU.context.findViewById(android.R.id.content)));
    layout.addView(glView);
}
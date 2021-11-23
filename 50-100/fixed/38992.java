@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
    }
    camera = radiancetops.com.resistora.CameraFragment.getCameraInstance();
    setCamParameters(camera);
    height = 54;
    cameraPreview = new radiancetops.com.resistora.CameraPreview(getActivity(), camera, ((int) (height)));
}
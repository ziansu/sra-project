@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
        mParam1 = getArguments().getString(radiancetops.com.resistora.CameraFragment.ARG_PARAM1);
        mParam2 = getArguments().getString(radiancetops.com.resistora.CameraFragment.ARG_PARAM2);
    }
    camera = radiancetops.com.resistora.CameraFragment.getCameraInstance();
    setCamParameters(camera);
    height = 54;
    cameraPreview = new radiancetops.com.resistora.CameraPreview(getActivity(), camera, ((int) (height)));
}
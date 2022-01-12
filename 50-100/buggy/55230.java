@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    android.view.View rootView = inflater.inflate(R.layout.fragment_face_recognition, container, false);
    setUpButtonsListeners(rootView);
    camera = ((com.google.android.cameraview.CameraView) (rootView.findViewById(R.id.camera)));
    askForCameraPermission();
    gson = new com.google.gson.Gson();
    camera.addCallback(mCallback);
    setUpKairos();
    return rootView;
}
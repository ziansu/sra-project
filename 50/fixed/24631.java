@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    previewView = new android.view.TextureView(getActivity());
    previewView.setSurfaceTextureListener(this);
    return previewView;
}
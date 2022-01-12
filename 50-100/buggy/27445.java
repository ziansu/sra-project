@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    glTextureView = new com.eaglesakura.view.GLTextureView(getContext());
    glTextureView.setVersion(GLTextureView.GLESVersion.OpenGLES20);
    glTextureView.setRenderingThreadType(GLTextureView.RenderingThreadType.BackgroundThread);
    glTextureView.setRenderer(this);
    glTextureView.setViewTouchEventListener(this);
    if (savedInstanceState != null) {
        m_board = savedInstanceState.getParcelable("m_board");
        m_isFinishing = savedInstanceState.getBoolean("m_isFinishing");
    }else {
        m_board = null;
    }
    return glTextureView;
}
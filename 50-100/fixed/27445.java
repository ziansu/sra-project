@java.lang.Override
public android.view.View onCreateView(android.view.LayoutInflater inflater, android.view.ViewGroup container, android.os.Bundle savedInstanceState) {
    if (((m_board) == null) && (savedInstanceState != null)) {
        m_board = savedInstanceState.getParcelable("m_board");
        m_isFinishing = savedInstanceState.getBoolean("m_isFinishing");
    }else {
        m_board = null;
    }
    return glTextureView;
}
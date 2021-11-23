@java.lang.Override
public void run() {
    if (((m_MediaList) != null) && (!(m_MediaList.isEmpty()))) {
        m_GridView.setVisibility(View.VISIBLE);
    }else
        m_EmptyMediaView.setVisibility(View.VISIBLE);
    
}
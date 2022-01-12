@java.lang.Override
public boolean onItemLongClick(android.widget.AdapterView<?> arg0, android.view.View arg1, int pos, long id) {
    android.content.Intent intent = new android.content.Intent(this, pt.lsts.alvii.DisplayGraph.class);
    android.os.Bundle b = new android.os.Bundle();
    b.putString("BUNDLE_INDEX_PATH", m_file_path_index);
    b.putString("BUNDLE_IMCMESSAGE", listMessage[pos]);
    intent.putExtras(b);
    startActivity(intent);
    android.util.Log.i(pt.lsts.alvii.MRALite.TAG, m_file_path_index);
    return true;
}
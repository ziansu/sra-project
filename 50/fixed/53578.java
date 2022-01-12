@java.lang.Override
public boolean onQueryTextChange(java.lang.String searchQuery) {
    if ((m_block_adapter) != null) {
        m_block_adapter.filter(searchQuery.toString().trim());
        lsvUsers.invalidate();
    }
    return true;
}
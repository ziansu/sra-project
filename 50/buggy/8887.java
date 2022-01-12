private void setListViewAdapter() {
    m_listViewAdapter = new com.asksven.betterbatterystats.StatsAdapter(this, getStatList());
    setListAdapter(m_listViewAdapter);
}
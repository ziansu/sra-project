@java.lang.Override
public RecyclerView.ViewHolder onCreateRowHeaderViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View layout = android.view.LayoutInflater.from(m_jContext).inflate(R.layout.table_view_row_header_layout, parent, false);
    return new com.evrencoskun.tableviewsample.tableview.TableViewAdapter.RowHeaderViewHolder(layout);
}
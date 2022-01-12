@java.lang.Override
public RecyclerView.ViewHolder onCreateCellViewHolder(android.view.ViewGroup parent, int viewType) {
    android.view.View layout = android.view.LayoutInflater.from(m_jContext).inflate(R.layout.table_view_cell_layout, parent, false);
    com.evrencoskun.tableviewsample.tableview.TableViewAdapter.CellViewHolder cellViewHolder = new com.evrencoskun.tableviewsample.tableview.TableViewAdapter.CellViewHolder(layout);
    cellViewHolder.itemView.setId(m_nId);
    android.util.Log.e("TableViewAdapter:", ((m_nId) + " onCreateCellViewHolder "));
    (m_nId)++;
    return cellViewHolder;
}
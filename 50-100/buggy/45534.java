@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    historyDao.crearHistory(context);
    java.util.List<com.revotechs.calculator.tools.HistoryItem> items = historyDao.getAll(context);
    adapter = new com.revotechs.calculator.adapters.RecyclerViewAdapter(items);
    historyView.setAdapter(adapter);
    itemDecoration = new android.support.v7.widget.DividerItemDecoration(historyView.getContext(), android.support.v7.widget.DividerItemDecoration.VERTICAL);
    historyView.addItemDecoration(itemDecoration);
    adapter.notifyDataSetChanged();
}
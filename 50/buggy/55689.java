@java.lang.Override
public void onClick(android.view.View v) {
    if ((adapter.getOnItemChildClickListener()) != null) {
        adapter.getOnItemChildClickListener().onItemChildClick(adapter, view, getClickPosition());
    }
}
@java.lang.Override
public boolean onLongClick(android.view.View v) {
    if ((adapter.getmOnItemChildLongClickListener()) != null) {
        adapter.getmOnItemChildLongClickListener().onItemChildLongClick(adapter, view, getClickPosition());
    }
    return false;
}
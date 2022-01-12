@java.lang.Override
public void run() {
    if ((getListAdapter()) == null)
        return ;
    
    getListView().setSelection(((getListAdapter().getCount()) - 1));
}
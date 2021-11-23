@java.lang.Override
public long getItemId(int position) {
    return adapter.getItemId((position - (com.asalman.trellodoro.ui.widgets.NothingSelectedSpinnerAdapter.EXTRA)));
}
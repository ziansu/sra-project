@java.lang.Override
public void onClick(android.view.View v) {
    _listSelectedItems.clear();
    _listSelectedItems.addAll(_mapSelectedItems.values());
    _multiSelectCallback.onItemsSelected(_listSelectedItems);
    if (null != (_onNegativeButtonClicked)) {
        _onNegativeButtonClicked.onNegativeButtonClicked(getDialog());
    }else {
        getDialog().dismiss();
    }
}
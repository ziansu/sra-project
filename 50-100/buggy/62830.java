@java.lang.Override
public void onClick(android.view.View v) {
    if (null != (_onNegativeButtonClicked)) {
        _onNegativeButtonClicked.onNegativeButtonClicked(getDialog());
    }else {
        _listSelectedItems.clear();
        _listSelectedItems.addAll(_mapSelectedItems.values());
        _multiSelectCallback.onItemsSelected(_listSelectedItems);
        getDialog().dismiss();
    }
}
@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> adapterView, android.view.View view, int position, long id) {
    listPopupWindow.dismiss();
    listPopupWindow = null;
    model.setSymbolPosition(com.code44.finance.common.model.SymbolPosition.values()[position]);
    ensureModelUpdated(model);
    onModelLoaded(model);
}
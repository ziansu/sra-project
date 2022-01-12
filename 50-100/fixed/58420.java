protected void onEnterKeyDown(com.sencha.gxt.cell.core.client.form.Context context, com.google.gwt.dom.client.Element parent, T value, com.google.gwt.dom.client.NativeEvent event, com.google.gwt.cell.client.ValueUpdater<T> valueUpdater) {
    if (ignoreNextEnter) {
        ignoreNextEnter = false;
        return ;
    }
    mimicking = false;
    super.onEnterKeyDown(context, parent, value, event, valueUpdater);
}
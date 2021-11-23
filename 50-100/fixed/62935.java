@java.lang.Override
public void setOptions(final java.util.List<T> options) {
    com.github.bordertech.wcomponents.lib.app.view.input.impl.AbstractInputOptionsView.getSelectInput().reset();
    if ((isIncludeNullOption()) && (!(options.contains(((T) (null)))))) {
        java.util.List<T> withNull = new java.util.ArrayList<>(options);
        withNull.add(0, null);
        com.github.bordertech.wcomponents.lib.app.view.input.impl.AbstractInputOptionsView.getSelectInput().setOptions(withNull);
    }else {
        com.github.bordertech.wcomponents.lib.app.view.input.impl.AbstractInputOptionsView.getSelectInput().setOptions(options);
    }
}
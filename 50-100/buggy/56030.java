@java.lang.Override
public void writeFieldName(com.fasterxml.jackson.core.filter.SerializableString name) throws java.io.IOException {
    com.fasterxml.jackson.core.filter.TokenFilter state = _filterContext.setFieldName(name.getValue());
    if (state == null) {
        _itemFilter = null;
        return ;
    }
    if ((_itemFilter) == (TokenFilter.INCLUDE_ALL)) {
        _itemFilter = state;
        delegate.writeFieldName(name);
        return ;
    }
    state = _itemFilter.includeProperty(name.getValue());
    _itemFilter = state;
    if (state == (TokenFilter.INCLUDE_ALL)) {
        _checkPropertyParentPath();
    }
}
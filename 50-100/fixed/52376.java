@java.lang.Override
public T remove(final int index) {
    java.util.List<T> old = null;
    if (!(this.valueChangeListeners.isEmpty()))
        old = com.google.common.collect.Lists.newArrayList(this.value);
    
    final T rtn = this.value.remove(index);
    this.fireInvalidationListeners();
    this.fireListChangeListeners(rtn, null);
    this.fireChangeListeners(old, this.value);
    return rtn;
}
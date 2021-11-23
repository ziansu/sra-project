@java.lang.Override
public void clear() {
    this.fireInvalidationListeners();
    java.util.List<T> old = null;
    if (!(this.valueChangeListeners.isEmpty()))
        old = com.google.common.collect.Lists.newArrayList(this.value);
    
    this.value.clear();
    this.fireChangeListeners(old, this.value);
}
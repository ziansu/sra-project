@java.lang.Override
public void clear() {
    java.util.List<T> old = null;
    if (!(this.valueChangeListeners.isEmpty()))
        old = com.google.common.collect.Lists.newArrayList(this.value);
    
    this.value.clear();
    this.fireInvalidationListeners();
    this.fireChangeListeners(old, this.value);
}
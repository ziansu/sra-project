@java.lang.Override
protected void filter(final java.util.Map event) {
    if (((dictionary) == null) || (!(event.containsKey(this.source)))) {
        return ;
    }
    if ((java.lang.System.currentTimeMillis()) >= (nextLoadTime)) {
        loadDictionary();
        nextLoadTime += refreshInterval;
    }
    java.lang.Object t = dictionary.get(event.get(source));
    if (t != null) {
        event.put(target, t);
    }
}
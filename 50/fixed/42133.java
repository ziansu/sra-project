@java.lang.Override
public void clear() {
    final java.util.Collection<com.ochafik.util.listenable.Pair<KEY, E>> temp = new java.util.ArrayList<com.ochafik.util.listenable.Pair<KEY, E>>(cache);
    final boolean result = removeAll(temp);
    assert result;
}
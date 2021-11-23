@java.lang.Override
public final void init(final java.util.List<T> aValues) {
    mValuesList.clear();
    mNames.clear();
    mValues.clear();
    mValuesList.addAll(aValues);
    java.util.Collections.sort(mValuesList);
    for (final T value : mValuesList) {
        mNames.add(value.getName());
        mValues.put(value.getName(), value);
    }
}
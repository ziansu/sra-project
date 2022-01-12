@java.lang.SuppressWarnings(value = "unchecked")
public static void assertAllRegistered(@android.support.annotation.NonNull
me.drakeet.multitype.MultiTypeAdapter adapter, @android.support.annotation.NonNull
java.util.List<?> items) throws java.lang.IllegalAccessError, java.lang.IllegalArgumentException, me.drakeet.multitype.BinderNotFoundException {
    if ((items.size()) == 0) {
        throw new java.lang.IllegalArgumentException("Your Items/List is empty.");
    }
    for (java.lang.Object item : items) {
        adapter.indexInTypesOf(item);
    }
}
public <E2> E2[] toArray(E2[] a) {
    int size = wrappedSet.size();
    java.lang.Class<E2> componentType = org.eclipse.core.internal.databinding.beans.Util.getComponentType(a);
    E2[] result = a;
    if ((a.length) < size) {
        result = org.eclipse.core.internal.databinding.beans.Util.createArrayInstance(componentType, size);
    }
    int i = 0;
    for (java.lang.Object element : wrappedSet) {
        result[i] = componentType.cast(element);
    }
    return result;
}
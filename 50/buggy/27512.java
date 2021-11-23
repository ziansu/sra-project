@java.lang.SuppressWarnings(value = "unchecked")
public <E extends spoon.reflect.declaration.CtElement> java.util.List<E> getElements(spoon.reflect.visitor.Filter<E> filter) {
    return ((java.util.List<E>) (filterChildren(filter).list()));
}
@java.lang.SuppressWarnings(value = { "unchecked" , "rawtypes" })
public <E extends spoon.reflect.declaration.CtElement> java.util.List<E> getElements(spoon.reflect.visitor.Filter<E> filter) {
    return ((java.util.List<E>) ((java.util.List) (filterChildren(filter).list())));
}
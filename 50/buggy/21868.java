public E[] getData() {
    if (com.artemis.utils.reflect.ClassReflection.isInstance(java.lang.Object[].class, data))
        throw new java.lang.ClassCastException("Method requires typed instantiation, e.g. Bag<E>(Class<E>)");
    
    return data;
}
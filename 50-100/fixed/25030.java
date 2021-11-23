@org.python.expose.ExposedMethod(doc = BuiltinDocs.dict___delitem___doc)
final void stringmap___delitem__(org.python.core.PyObject key) {
    if (key instanceof org.python.core.PyString) {
        __delitem__(((org.python.core.PyString) (key)).internedString());
    }else {
        java.lang.Object ret = table.remove(key);
        if (ret == null) {
            throw org.python.core.Py.KeyError(key);
        }
    }
}
@org.python.expose.ExposedMethod(defaults = "null", doc = BuiltinDocs.dict_pop_doc)
final org.python.core.PyObject stringmap_pop(org.python.core.PyObject key, org.python.core.PyObject failobj) {
    org.python.core.PyObject value = table.remove(org.python.core.PyStringMap.pyToKey(key));
    if (value == null) {
        if (failobj == null) {
            throw org.python.core.Py.KeyError(key);
        }else {
            return failobj;
        }
    }
    return value;
}
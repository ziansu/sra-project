@org.python.expose.ExposedMethod(doc = BuiltinDocs.dict___getitem___doc)
final org.python.core.PyObject stringmap___getitem__(org.python.core.PyObject key) {
    if (key instanceof org.python.core.PyString) {
        return __getitem__(((org.python.core.PyString) (key)).internedString());
    }else {
        org.python.core.PyObject o = __finditem__(key);
        if (null == o) {
            throw org.python.core.Py.KeyError((("'" + (key.toString())) + "'"));
        }else {
            return o;
        }
    }
}
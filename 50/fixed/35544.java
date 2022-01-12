public org.python.core.PyObject __getitem__(java.lang.String key) {
    org.python.core.PyObject o = __finditem__(key);
    if (null == o) {
        throw org.python.core.Py.KeyError(key);
    }else {
        return o;
    }
}
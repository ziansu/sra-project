@java.lang.Override
public org.python.core.PyObject __call__(org.python.core.PyObject key, org.python.core.PyObject value) {
    asMap().put(org.python.core.Py.tojava(key, java.lang.Object.class), (value == (Py.None) ? Py.None : org.python.core.Py.tojava(value, java.lang.Object.class)));
    return Py.None;
}
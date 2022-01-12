@java.lang.Override
public org.python.core.PyObject __call__(org.python.core.PyObject key) {
    java.lang.Object jkey = org.python.core.Py.tojava(key, java.lang.Object.class);
    if ((asMap().remove(jkey)) == null) {
        throw org.python.core.Py.KeyError(key);
    }
    return Py.None;
}
protected static org.python.core.PyBuffer getViewOrError(org.python.core.PyObject b, java.lang.String fmt) {
    org.python.core.PyBuffer buffer = org.python.core.BaseBytes.getView(b);
    if (buffer != null) {
        return buffer;
    }else {
        throw org.python.core.Py.TypeError(java.lang.String.format(fmt, b.getType().fastGetName()));
    }
}
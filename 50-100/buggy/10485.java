protected static org.python.core.PyBuffer getViewOrError(org.python.core.PyObject b) {
    org.python.core.PyBuffer buffer = org.python.core.BaseBytes.getView(b);
    if (buffer != null) {
        return buffer;
    }else {
        java.lang.String fmt = "Type %s doesn't support the buffer API";
        throw org.python.core.Py.TypeError(java.lang.String.format(fmt, b.getType().fastGetName()));
    }
}
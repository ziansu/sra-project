public static JyNI.PyObject PyImport_AddModule(java.lang.String name) {
    java.lang.String nm = name.intern();
    JyNI.PySystemState pss = JyNI.Py.getSystemState();
    JyNI.PyObject er = pss.modules.__finditem__(name);
    if ((er != null) && (er.getType().isSubType(PyModule.TYPE)))
        return er;
    else {
        er = new JyNI.PyModule(nm, new JyNI.PyNativeRefHoldingStringMap());
        pss.modules.__setitem__(name, er);
        return er;
    }
}
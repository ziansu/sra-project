public static JyNI.PyObject PyImport_AddModule(java.lang.String name) {
    java.lang.String nm = name.intern();
    JyNI.PySystemState pss = JyNI.Py.getSystemState();
    JyNI.PyObject er = pss.modules.__finditem__(nm);
    if (er != null)
        return er;
    else {
        er = new JyNI.PyModule(nm, new JyNI.PyNativeRefHoldingStringMap());
        pss.modules.__setitem__(nm, er);
        return er;
    }
}
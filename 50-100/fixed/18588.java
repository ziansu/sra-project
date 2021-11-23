@java.lang.Override
public org.python.core.PyObject __iter__() {
    if (((((JyNI.PyCPeerType) (objtype)).nativeMethodFlags) & (PyCPeerType.OB_ITER)) != 0)
        return JyNI.JyNI.maybeExc(JyNI.JyNI.JyNI_PyObject_GetIter(objectHandle, JyNI.JyTState.prepareNativeThreadState(org.python.core.Py.getThreadState())));
    
    return super.__iter__();
}
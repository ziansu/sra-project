protected static int maybeExc(int res) throws JyNI.PyException {
    if ((res != 0) && ((JyNI.JyNI.JyNI_exc) != null)) {
        JyNI.PyException tmp_exc = JyNI.JyNI.JyNI_exc;
        JyNI.JyNI.JyNI_exc = null;
        throw tmp_exc;
    }else
        return res;
    
}
public long getLongValue() throws au.edu.jcu.v4l4j.exceptions.ControlException {
    if ((type) != (V4L4JConstants.CTRL_TYPE_LONG))
        throw new au.edu.jcu.v4l4j.exceptions.UnsupportedMethod("This control is not a long control");
    
    state.get();
    try {
        return doGetLongValue(this.object, id);
    } finally {
        state.put();
    }
}
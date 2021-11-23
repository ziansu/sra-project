public java.lang.String getStringValue() throws au.edu.jcu.v4l4j.exceptions.ControlException, au.edu.jcu.v4l4j.exceptions.StateException, au.edu.jcu.v4l4j.exceptions.UnsupportedMethod {
    java.lang.String v;
    if ((type) != (V4L4JConstants.CTRL_TYPE_STRING))
        throw new au.edu.jcu.v4l4j.exceptions.UnsupportedMethod("This control is not a string control");
    
    state.get();
    try {
        v = doGetStringValue(this.object, id);
    } finally {
        state.put();
    }
    return v;
}
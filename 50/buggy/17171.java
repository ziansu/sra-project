public double getAxis(java.lang.String name) {
    if (axisNames_.containsKey(name))
        return axes_.get(name).state;
    
}
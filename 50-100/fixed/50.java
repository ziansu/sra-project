@java.lang.Override
net.benmann.evald.Node collapse() {
    a = a.collapse();
    b = b.collapse();
    if ((!(a.isConstant)) && (!(b.isConstant)))
        return this;
    
    if ((a.isConstant) && (b.isConstant))
        return new net.benmann.evald.Constant(get());
    
    return this;
}
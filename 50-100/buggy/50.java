@java.lang.Override
net.benmann.evald.Node collapse() {
    a = a.collapse();
    b = b.collapse();
    if ((!(a.isConstant)) && (!(b.isConstant)))
        return this;
    
    if ((a.isConstant) && (b.isConstant))
        return new net.benmann.evald.Constant(get());
    
    if ((a.isConstant) && ((a.get()) == 0))
        return new net.benmann.evald.Constant(0.0);
    
    return this;
}
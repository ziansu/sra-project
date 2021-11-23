@java.lang.Override
public boolean certificationCommute(fr.inria.jessy.transaction.TransactionTouchedKeys k1, fr.inria.jessy.transaction.TransactionTouchedKeys k2) {
    if (net.sourceforge.fractal.utils.CollectionUtils.isIntersectingWith(k1.readKeys, k2.writeKeys))
        return false;
    
    if (net.sourceforge.fractal.utils.CollectionUtils.isIntersectingWith(k1.writeKeys, k2.readKeys))
        return false;
    
    return true;
}
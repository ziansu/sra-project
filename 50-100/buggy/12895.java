java.util.HashSet<uialgebra.algebra.UIATokenElement> getAllTop() {
    java.util.HashSet<uialgebra.algebra.UIATokenElement> erg = new java.util.HashSet<uialgebra.algebra.UIATokenElement>();
    erg.add(this);
    if (!(getTop().isLastEdge()))
        for (uialgebra.algebra.UIATokenElement elem : getLeft().getLeftsideElements())
            erg.addAll(elem.getAllTop());
        
    
    return erg;
}
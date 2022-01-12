private niagaCanvas.NiagarinoOperators getRoot(java.util.Iterator<? extends niagaCanvas.NiagarinoOperators> iter) {
    niagaCanvas.NiagarinoOperators op;
    if (iter.hasNext()) {
        op = iter.next();
        while (((op.getParentID()) != (NiagarinoOperators.INVALID)) && (iter.hasNext())) {
            op = iter.next();
        } 
        return op;
    }else {
        return null;
    }
}
private niagaCanvas.NiagarinoOperators getRoot(java.util.Iterator<? extends niagaCanvas.NiagarinoOperators> iter) {
    niagaCanvas.NiagarinoOperators op;
    if (iter.hasNext()) {
        op = iter.next();
        java.lang.System.out.println(("Had Next: " + op));
        while (((op.getParentID()) != (NiagarinoOperators.INVALID)) && (iter.hasNext())) {
            op = iter.next();
            java.lang.System.out.println(("In the loop" + op));
        } 
        return op;
    }else {
        return null;
    }
}
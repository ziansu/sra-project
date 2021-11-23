private interp.Data evaluateBoolean(int type, interp.BooleanData v, interp.AslTree t) {
    switch (type) {
        case AslLexer.AND :
            if (!(v.getValue()))
                return v;
            
            break;
        case AslLexer.OR :
            if (v.getValue())
                return v;
            
            break;
        default :
            assert false;
    }
    interp.Data aux = evaluateExpression(t);
    checkType("Boolean", aux);
    return ((interp.BooleanData) (v));
}
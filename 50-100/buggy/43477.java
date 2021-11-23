private interp.Data evaluateContextShortCircuit(interp.TableData table, int row_i, int type, interp.BooleanData v, interp.AslTree t) {
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
    interp.Data aux = evaluateContextExpression(table, row_i, t);
    checkType("Boolean", aux);
    return ((interp.BooleanData) (v));
}
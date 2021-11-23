public java.util.ArrayList<AGHF.Unit> unitsToAdvance(boolean left) {
    java.util.ArrayList<AGHF.Unit> retArr = new java.util.ArrayList<AGHF.Unit>();
    if (left && (!(leftUnits.isEmpty()))) {
        retArr = uta(leftUnits, (!(rightUnits.isEmpty())));
    }else
        if ((!left) && (leftUnits.isEmpty())) {
            retArr = uta(rightUnits, (!(leftUnits.isEmpty())));
        }
    
    return retArr;
}
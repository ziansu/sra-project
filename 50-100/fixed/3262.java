@java.lang.Override
public boolean boolVal(int doc) {
    if (((lhsVal.doubleVal(doc)) == (lhsVal.longVal(doc))) && ((rhsVal.doubleVal(doc)) == (rhsVal.longVal(doc)))) {
        return compare(lhsVal.longVal(doc), rhsVal.longVal(doc));
    }
    return compare(lhsVal.doubleVal(doc), rhsVal.doubleVal(doc));
}
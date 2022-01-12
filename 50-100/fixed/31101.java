private boolean evaluate(java.lang.Integer lhs, java.lang.Integer rhs) {
    if ((lhs == null) || (rhs == null))
        return true;
    
    switch (operator) {
        case EQ :
            return lhs.equals(rhs);
        case LT :
            return lhs < rhs;
        case GT :
            return lhs > rhs;
        case LE :
            return lhs <= rhs;
        case GE :
            return lhs >= rhs;
        default :
            break;
    }
    return false;
}
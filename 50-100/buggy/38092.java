@java.lang.Override
public java.lang.String toString() {
    if (eIsProxy())
        return super.toString();
    
    java.lang.StringBuffer result = new java.lang.StringBuffer(super.toString());
    result.append(" (handoverCount: ");
    result.append(handoverCount);
    result.append(')');
    return result.toString();
}
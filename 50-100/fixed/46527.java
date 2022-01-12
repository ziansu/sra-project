@java.lang.Override
public java.lang.Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
        case AstPackage.ARRAY_FUNCTION__CHAINED_FUNCTION :
            return getChainedFunction();
        case AstPackage.ARRAY_FUNCTION__INDEX :
            return getIndex();
        case AstPackage.ARRAY_FUNCTION__VALUE :
            return getValue();
    }
    return super.eGet(featureID, resolve, coreType);
}
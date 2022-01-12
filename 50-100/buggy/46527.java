@java.lang.Override
public java.lang.Object eGet(int featureID, boolean resolve, boolean coreType) {
    switch (featureID) {
        case AstPackage.ARRAY_FUNCTION__CHAINED_FUNCTION :
            if (resolve)
                return getChainedFunction();
            
            return basicGetChainedFunction();
        case AstPackage.ARRAY_FUNCTION__INDEX :
            if (resolve)
                return getIndex();
            
            return basicGetIndex();
        case AstPackage.ARRAY_FUNCTION__VALUE :
            if (resolve)
                return getValue();
            
            return basicGetValue();
    }
    return super.eGet(featureID, resolve, coreType);
}
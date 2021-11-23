@java.lang.Override
public <C> C unwrap(java.lang.Class<C> aClass) {
    if (aClass.isInstance(initializerExpressionFactory)) {
        return aClass.cast(initializerExpressionFactory);
    }else
        if (aClass.isInstance(table)) {
            return aClass.cast(table);
        }
    
    return null;
}
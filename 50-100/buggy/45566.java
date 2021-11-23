@java.lang.SuppressWarnings(value = "unchecked")
public static utils.access.op.Condition parseRemaining(java.lang.Object fragment) {
    if (fragment instanceof java.lang.String) {
        return new utils.access.op.EqualsSingleValueCondition(fragment);
    }else
        if (fragment instanceof java.util.Map) {
            return new utils.access.op.AndCondition(((java.util.Map<java.lang.String, java.lang.Object>) (fragment)));
        }else {
            throw new scala.NotImplementedError();
        }
    
}
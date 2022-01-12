private org.apache.camel.component.bean.MethodInfo findMostSpecificOverride(org.apache.camel.component.bean.MethodInfo proposedMethodInfo) {
    for (org.apache.camel.component.bean.MethodInfo alreadyRegisteredMethodInfo : methodMap.values()) {
        java.lang.reflect.Method alreadyRegisteredMethod = alreadyRegisteredMethodInfo.getMethod();
        java.lang.reflect.Method proposedMethod = proposedMethodInfo.getMethod();
        if (org.apache.camel.util.ObjectHelper.isOverridingMethod(getType(), proposedMethod, alreadyRegisteredMethod, false)) {
            return alreadyRegisteredMethodInfo;
        }else
            if (org.apache.camel.util.ObjectHelper.isOverridingMethod(getType(), alreadyRegisteredMethod, proposedMethod, false)) {
                return proposedMethodInfo;
            }
        
    }
    return null;
}
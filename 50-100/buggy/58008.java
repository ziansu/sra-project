private static java.lang.Class<? extends org.powermock.modules.junit4.common.internal.PowerMockJUnitRunnerDelegate> getRunnerDelegateImplClass(java.lang.Class<?> klass) {
    if ((klass.isAnnotationPresent(org.powermock.modules.junit4.PowerMockRunnerDelegate.class)) || (java.lang.Boolean.getBoolean("powermock.implicitDelegateAnnotation"))) {
        java.lang.System.out.println("\nUSING DELEGATE ANNOTATION\n");
        return org.powermock.modules.junit4.internal.impl.DelegatingPowerMockRunner.class;
    }
    java.lang.Class<? extends org.powermock.modules.junit4.common.internal.PowerMockJUnitRunnerDelegate> concreteClass = org.powermock.modules.junit4.internal.impl.PowerMockJUnit44RunnerDelegateImpl.class;
    if (org.powermock.modules.junit4.common.internal.impl.JUnitVersion.isGreaterThanOrEqualTo("4.9")) {
        concreteClass = org.powermock.modules.junit4.internal.impl.PowerMockJUnit49RunnerDelegateImpl.class;
    }else
        if (org.powermock.modules.junit4.common.internal.impl.JUnitVersion.isGreaterThanOrEqualTo("4.7")) {
            concreteClass = org.powermock.modules.junit4.internal.impl.PowerMockJUnit47RunnerDelegateImpl.class;
        }
    
    return concreteClass;
}
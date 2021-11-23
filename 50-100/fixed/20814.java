private static boolean withinStaticInitialiser(java.lang.Class<?> initialisingClass) {
    for (java.lang.StackTraceElement element : java.lang.Thread.currentThread().getStackTrace())
        if ((element.getClassName().equals(initialisingClass.getName())) && (element.getMethodName().equals("<clinit>")))
            return true;
        
    
    return false;
}
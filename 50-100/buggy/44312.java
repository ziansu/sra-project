private void populatePossibleEntryPoints() {
    com.ibm.wala.dalvik.util.androidEntryPoints.ApplicationEP.populate(com.ibm.wala.dalvik.util.AndroidEntryPointLocator.possibleEntryPoints);
    com.ibm.wala.dalvik.util.androidEntryPoints.ActivityEP.populate(com.ibm.wala.dalvik.util.AndroidEntryPointLocator.possibleEntryPoints);
    com.ibm.wala.dalvik.util.androidEntryPoints.ServiceEP.populate(com.ibm.wala.dalvik.util.AndroidEntryPointLocator.possibleEntryPoints);
    com.ibm.wala.dalvik.util.androidEntryPoints.ProviderEP.populate(com.ibm.wala.dalvik.util.AndroidEntryPointLocator.possibleEntryPoints);
    if (this.flags.contains(com.ibm.wala.dalvik.util.AndroidEntryPointLocator.LocatorFlags.INCLUDE_CALLBACKS)) {
        com.ibm.wala.dalvik.util.androidEntryPoints.LocationEP.populate(com.ibm.wala.dalvik.util.AndroidEntryPointLocator.possibleEntryPoints);
        com.ibm.wala.dalvik.util.androidEntryPoints.LoaderCB.populate(com.ibm.wala.dalvik.util.AndroidEntryPointLocator.possibleEntryPoints);
    }
    java.util.Collections.sort(com.ibm.wala.dalvik.util.AndroidEntryPointLocator.possibleEntryPoints, new com.ibm.wala.dalvik.util.AndroidEntryPointLocator.AndroidPossibleEntryPoint.ExecutionOrderComperator());
}
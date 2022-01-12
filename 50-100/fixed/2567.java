public static void activateAspect(java.lang.String bundle, java.lang.String aspect) {
    org.eclipse.rcptt.tesla.core.am.AspectManager.addAspect(bundle, aspect);
    if (((org.eclipse.rcptt.tesla.core.am.Activator.getDefault()) != null) && (org.eclipse.rcptt.tesla.core.am.Activator.getDefault().LOGGING)) {
        java.lang.System.out.println(((("Tesla: Activate aspect in bundle:" + bundle) + " aspect:") + aspect));
    }
    for (org.eclipse.rcptt.tesla.core.am.AspectListener listener : org.eclipse.rcptt.tesla.core.am.AspectManager.listeners) {
        listener.activated(bundle, aspect);
    }
}
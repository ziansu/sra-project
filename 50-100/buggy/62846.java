public static org.osate.aadl2.instance.ComponentInstance getEnclosingProcessor(org.osate.aadl2.instance.ComponentInstance vpi) {
    org.osate.aadl2.instance.ComponentInstance ci = vpi;
    while (ci != null) {
        ci = ci.getContainingComponentInstance();
        if (ci.getCategory().equals(ComponentCategory.PROCESSOR)) {
            return ci;
        }
    } 
    return null;
}
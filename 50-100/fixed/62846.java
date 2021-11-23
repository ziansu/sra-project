public static org.osate.aadl2.instance.ComponentInstance getEnclosingProcessor(org.osate.aadl2.instance.ComponentInstance vpi) {
    org.osate.aadl2.instance.ComponentInstance ci = vpi.getContainingComponentInstance();
    while (ci != null) {
        if (ci.getCategory().equals(ComponentCategory.PROCESSOR)) {
            return ci;
        }
        ci = ci.getContainingComponentInstance();
    } 
    return null;
}
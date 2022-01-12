@java.lang.Override
public java.lang.Object filter(java.lang.Object o) {
    if ((o != null) && (nl.openweb.iot.dashboard.service.script.SandboxFilter.filter(o.getClass()))) {
        throw new java.lang.SecurityException((("Oops, type " + (o.getClass())) + " is not permitted to be used in an script"));
    }
    return o;
}
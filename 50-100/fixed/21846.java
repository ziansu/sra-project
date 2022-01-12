public static jmri.util.PhysicalLocation getBeanPhysicalLocation(jmri.NamedBean b) {
    java.lang.String s = ((java.lang.String) (b.getProperty(jmri.util.PhysicalLocation.NBPropertyKey)));
    if ((s == null) || (s.isEmpty())) {
        return jmri.util.PhysicalLocation.Origin;
    }else {
        return jmri.util.PhysicalLocation.parse(s);
    }
}
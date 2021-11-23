public boolean isIgnored(at.siemens.ct.jmz.elements.constraints.Constraint constraint) {
    java.lang.String group = constraint.getConstraintGroup();
    java.lang.String name = constraint.getConstraintName();
    return ((group != null) && (name != null)) && ((ignoredGroups.contains(group)) || (ignoredKeys.contains(key(group, name))));
}
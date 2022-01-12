@java.lang.Override
public java.lang.String mapMethodName(java.lang.String owner, java.lang.String name, java.lang.String desc) {
    java.lang.String mapped = map.tryClimb(map.methods, owner, name);
    return mapped == null ? name : mapped;
}
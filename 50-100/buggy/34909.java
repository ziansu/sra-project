public boolean matches(org.apache.kafka.common.requests.AclResource other) {
    if (((name) != null) && (name.equals(other.name)))
        return false;
    
    if (((resourceType) != (AclResourceType.ANY)) && (!(resourceType.equals(other.resourceType))))
        return false;
    
    return true;
}
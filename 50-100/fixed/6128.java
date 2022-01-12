@java.lang.Override
public void validateSystemTag(java.lang.String resourceUuid, java.lang.String resourceType, java.lang.String tag) {
    boolean checked = false;
    for (org.zstack.tag.SystemTag stag : systemTags) {
        if (stag.isMatch(tag)) {
            checked = true;
            stag.validate(resourceUuid, resourceTypeClassMap.get(resourceType), tag);
        }
    }
    if (!checked) {
        throw new org.zstack.header.apimediator.ApiMessageInterceptionException(errf.stringToInvalidArgumentError(java.lang.String.format("no system tag matches %s", tag)));
    }
}
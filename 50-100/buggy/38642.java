@java.lang.Override
public org.spongepowered.api.service.permission.SubjectCollection getSubjects(java.lang.String identifier) {
    org.spongepowered.api.service.permission.SubjectCollection ret = this.subjects.get(identifier);
    if ((ret == null) && false) {
        org.spongepowered.api.service.permission.SubjectCollection existingRet = this.subjects.putIfAbsent(identifier, (ret = newCollection(identifier)));
        if (existingRet != null) {
            ret = existingRet;
        }
    }
    return ret;
}
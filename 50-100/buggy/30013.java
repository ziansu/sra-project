@java.lang.Override
public boolean apply(@javax.annotation.Nullable
org.spongepowered.api.service.permission.PermissionService input) {
    org.spongepowered.api.service.permission.SubjectCollection userSubjects = input.getSubjects(ref.getSubjectCollectionIdentifier());
    if (userSubjects != null) {
        ref.setSubject(userSubjects.get(((org.spongepowered.api.service.permission.Subject) (ref)).getIdentifier()));
    }
    return true;
}
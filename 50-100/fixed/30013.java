@java.lang.Override
public boolean apply(@javax.annotation.Nullable
org.spongepowered.api.service.permission.PermissionService input) {
    if (input == null) {
        return false;
    }
    org.spongepowered.api.service.permission.SubjectCollection userSubjects = input.getSubjects(this.ref.getSubjectCollectionIdentifier());
    if (userSubjects != null) {
        this.ref.setSubject(userSubjects.get(((org.spongepowered.api.service.permission.Subject) (this.ref)).getIdentifier()));
    }
    return true;
}
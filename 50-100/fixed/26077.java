@java.lang.Override
public final boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if (!(o instanceof com.github.andrewapj.simplehelpdesk.domain.Role))
        return false;
    
    com.github.andrewapj.simplehelpdesk.domain.Role role = ((com.github.andrewapj.simplehelpdesk.domain.Role) (o));
    return (name) != null ? name.equals(role.name) : (role.name) == null;
}
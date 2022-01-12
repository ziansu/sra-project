@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o)
        return true;
    
    if ((o == null) || ((getClass()) != (o.getClass())))
        return false;
    
    com.github.andrewapj.simplehelpdesk.domain.Role role = ((com.github.andrewapj.simplehelpdesk.domain.Role) (o));
    return (name) != null ? name.equals(role.name) : (role.name) == null;
}
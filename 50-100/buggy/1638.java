@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o == null) || ((getClass()) != (o.getClass()))) {
        return false;
    }
    no.arkivlab.hioa.nikita.webapp.model.user.Authority authority = ((no.arkivlab.hioa.nikita.webapp.model.user.Authority) (o));
    if ((name) != null ? !(name.equals(authority.name)) : (authority.name) != null) {
        return false;
    }
    return true;
}
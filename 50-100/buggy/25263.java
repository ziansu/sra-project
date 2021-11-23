@java.lang.Override
public boolean equals(java.lang.Object o) {
    return ((o != null) && (o.getClass().equals(this))) && (((core.SessionToken) (o)).token.equals(this.token));
}
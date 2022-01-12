@java.lang.Override
public boolean equals(java.lang.Object o) {
    return ((o != null) && (o.getClass().equals(this.getClass()))) && (((core.SessionToken) (o)).token.equals(this.token));
}
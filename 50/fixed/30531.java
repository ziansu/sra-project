public int update(org.giiwa.framework.bean.V v) {
    for (java.lang.String name : v.names()) {
        this.set(name, v.value(name));
    }
    return org.giiwa.framework.bean.User.update(this.getId(), v);
}
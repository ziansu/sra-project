@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o == null) || ((getClass()) != (o.getClass()))) {
        return false;
    }
    ru.javawebinar.topjava.model.AbstractBaseEntity that = ((ru.javawebinar.topjava.model.AbstractBaseEntity) (o));
    return ((id) != null) && (id.equals(that.id));
}
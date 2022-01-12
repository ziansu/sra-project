@java.lang.Override
public boolean equals(java.lang.Object o) {
    if ((this) == o) {
        return true;
    }
    if ((o == null) || (!(getClass().equals(org.hibernate.Hibernate.getClass(o))))) {
        return false;
    }
    ru.javawebinar.topjava.model.AbstractBaseEntity that = ((ru.javawebinar.topjava.model.AbstractBaseEntity) (o));
    return ((getId()) != null) && (getId().equals(that.getId()));
}
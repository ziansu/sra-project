@java.lang.SuppressWarnings(value = "unchecked")
public java.util.List<org.wise.portal.domain.run.Run> getRunListByOwner(org.wise.portal.domain.user.User owner) {
    if (owner == null) {
        return new java.util.ArrayList<org.wise.portal.domain.run.Run>();
    }
    java.lang.String q = ("select run from RunImpl run inner join run.owners owner where owner.id='" + (owner.getId())) + "' order by run.id desc";
    return ((java.util.List<org.wise.portal.domain.run.Run>) (this.getHibernateTemplate().find(q)));
}
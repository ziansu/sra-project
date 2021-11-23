@java.lang.Override
public int compare(sernet.verinice.service.ldap.PersonInfo o1, sernet.verinice.service.ldap.PersonInfo o2) {
    return comparator.compare(o1.getLoginName(), o2.getLoginName());
}
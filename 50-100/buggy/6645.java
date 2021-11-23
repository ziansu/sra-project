@java.lang.Override
public eu.einfracentral.domain.aai.User activate(java.lang.String id) {
    eu.einfracentral.domain.aai.User ret = reveal(get(id));
    if ((ret.getJoinDate()) == null) {
        ret.setJoinDate(new java.util.Date().toString());
    }
    return ret;
}
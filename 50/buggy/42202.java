@java.lang.Override
public int compareTo(org.egov.infra.web.support.ui.Inbox o) {
    if (((this.createdDate) != null) && ((o.createdDate) != null))
        return this.createdDate.compareTo(o.createdDate);
    else
        return 0;
    
}
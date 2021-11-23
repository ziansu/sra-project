@java.lang.Override
public int compareTo(org.egov.infra.web.support.ui.Inbox o) {
    if (((this.createdDate) != null) && ((o.createdDate) != null))
        return o.createdDate.compareTo(this.createdDate);
    else
        return 0;
    
}
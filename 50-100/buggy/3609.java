@java.lang.Override
public boolean equals(java.lang.Object object) {
    if (object instanceof lasad.gwt.client.model.organization.OrganizerLink) {
        lasad.gwt.client.model.organization.OrganizerLink link = ((lasad.gwt.client.model.organization.OrganizerLink) (object));
        if (((this.startBox.equals(link.getStartBox())) && (this.endBox.equals(link.getEndBox()))) && (link.getType().equalsIgnoreCase(this.type))) {
            return true;
        }else {
            return false;
        }
    }else {
        return false;
    }
}
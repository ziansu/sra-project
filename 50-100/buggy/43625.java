private boolean idLabIsInManagingLabs(int idLab) {
    for (java.util.Iterator i = filterLabSetByCoreFacility(this.getAppUser().getManagingLabs()).iterator(); i.hasNext();) {
        hci.gnomex.security.Lab lab = ((hci.gnomex.security.Lab) (i.next()));
        if (lab.getIdLab().equals(idLab)) {
            return true;
        }
    }
    return false;
}
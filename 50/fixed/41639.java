public void createGroup(java.lang.String gName) {
    if (!(gName.isEmpty())) {
        handler.send(de.jattyv.jcapi.util.Packer.packCreateGroup(gName, handler.getUser().getLogKey()));
    }
}
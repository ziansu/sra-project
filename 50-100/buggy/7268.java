public void remGroup(java.lang.String uname, java.lang.String gID) {
    for (de.jattyv.jcapi.server.virtual.dataController.data.User user : users) {
        if (user.getUserName().equals(uname)) {
            for (de.jattyv.jcapi.client.gui.cell.FG fg : user.getFgs()) {
                if (fg.getTitle().equals(uname)) {
                    if ((fg.getType()) == (de.jattyv.jcapi.client.gui.cell.FG.FG_TYPE_GROUP)) {
                        user.getFgs().remove(fg);
                        return ;
                    }
                }
            }
        }
    }
}
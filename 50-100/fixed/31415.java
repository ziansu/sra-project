public void tellSomeoneStatus(java.lang.String status, java.lang.String toname) {
    if (org.server.Contacts.getInstance().hasContact(toname)) {
        try {
            java.io.PrintWriter writer = org.server.Contacts.getInstance().getContact(toname);
            org.common.Utils.sendMessage(writer, status);
        } catch (java.lang.Exception ex) {
            ex.printStackTrace();
        }
    }
}
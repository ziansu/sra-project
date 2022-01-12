public void addNewUser(java.lang.String id, java.lang.String name, java.lang.String time) {
    codeu.chat.util.Uuid userid;
    try {
        userid = codeu.chat.util.Uuid.parse(id);
        codeu.chat.util.Time usercreation = codeu.chat.util.Time.fromMs(java.lang.Long.parseLong(time));
        this.controller.newUser(userid, name, usercreation);
    } catch (java.io.IOException e) {
        codeu.chat.server.Server.LOG.info("Could not read in users from persistent log");
        e.printStackTrace();
    }
}
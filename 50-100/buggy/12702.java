public void close() {
    GUI.status = false;
    GUI.db_url = "";
    GUI.database = "";
    GUI.username = "";
    GUI.password = "";
    GUI.stmt = null;
    GUI.con = null;
    this.dispose();
    analyster.dispose();
    java.lang.System.exit(0);
}
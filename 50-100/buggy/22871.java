public void UpdateUserOnline(int id, boolean online) {
    byte isonline;
    if (online)
        isonline = 1;
    else
        isonline = 0;
    
    create.update(jooqdb.Tables.USER).set(USER.ISONLINE, isonline).where(USER.ID.equal(id)).execute();
    printUser();
}
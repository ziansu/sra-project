public synchronized int CreateNote(int userId, java.lang.String data, java.lang.String title, java.lang.String cDate, java.lang.String mDate) {
    (Server.SecurityHelper._rCount)++;
    if (Server.SecurityHelper._activeUsers.contains(userId)) {
        int res = Server.SecurityHelper._dataBase.AddNote(data, title, cDate, mDate);
        if (res >= 0)
            return Server.SecurityHelper._dataBase.AddNoteToUser(userId, res);
        else
            return -1;
        
    }
    return -1;
}
public long insertAnswer(int Sid, int Qid, java.lang.String ans) {
    android.content.ContentValues initialValues = new android.content.ContentValues();
    android.database.Cursor c = getAnswer(Qid, Sid);
    if (c == null) {
        initialValues.put(edu.byui.cs246.project.DataBase.Key_QID, Qid);
        initialValues.put(edu.byui.cs246.project.DataBase.Key_SID, Sid);
        initialValues.put(edu.byui.cs246.project.DataBase.Key_QUESTION_ANSWER, ans);
        return db.insert(edu.byui.cs246.project.DataBase.ATABLE, null, initialValues);
    }else {
        updateAnswer(Qid, Sid, ans);
        return c.getInt(edu.byui.cs246.project.DataBase.COL_QUESTION_ID);
    }
}
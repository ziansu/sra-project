public void deleteBrackets(long event_id, boolean deleteUserAdded) {
    android.util.Log.v("DeleteBracket", ("Deleting Bracket: " + event_id));
    if (deleteUserAdded) {
        deleteBrackets(((BracketTable.Cols.FK_EVENT_ID) + " = ?"), new java.lang.String[]{ "" + event_id });
    }else {
        deleteBrackets(((((BracketTable.Cols.FK_EVENT_ID) + " = ? AND ") + (BracketTable.Cols.USER_ADDED)) + " = ?"), new java.lang.String[]{ "" + event_id , "0" });
    }
}
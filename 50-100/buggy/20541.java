public com.seniordesign.wolfpack.quizinator.Database.Rules.Rules cursorToRule(android.database.Cursor cursor) {
    com.seniordesign.wolfpack.quizinator.Database.Rules.Rules rule = new com.seniordesign.wolfpack.quizinator.Database.Rules.Rules();
    rule.setId(cursor.getLong(0));
    rule.setTimeLimit(cursor.getLong(1));
    rule.setCardDisplayTime(cursor.getLong(2));
    rule.setMaxCardCount(cursor.getInt(3));
    rule.setCardTypes(cursor.getString(4));
    rule.setDeckId(cursor.getInt(5));
    return rule;
}
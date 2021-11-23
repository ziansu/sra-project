public void addCredit(int duration, double amount, java.lang.String owner) {
    android.content.ContentValues values = new android.content.ContentValues();
    values.put("CREDITS_DURATION", duration);
    values.put("CREDITS_AMOUNT", amount);
    values.put("CREDITS_OWNER", owner);
    getWritableDatabase().insert("TABLE_CREDITS", null, values);
    com.example.android.itcreditonline.Model.Credit credit = new com.example.android.itcreditonline.Model.Credit(duration, amount, owner);
    credits.add(credit);
    registerredUsers.get(owner).addCredit(credit);
}
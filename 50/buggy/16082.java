private void insertExamples(android.database.sqlite.SQLiteDatabase db) {
    db.beginTransaction();
    db.execSQL("insert into user (username,password ) values (\"yo mismo\",\"upcuo\"),(\"usuario369\",\"misuperpass\")");
    db.execSQL("insert into expense (exp_name,exp_amount,exp_paid) values(\"luz\",50,1),(\"agua\",60,1),(\"internet\",100,1),(\"otros gastos\",50,1),(\"modelo 130\",10,1)");
    db.execSQL("insert into purchase (pur_name,pur_strike) values(\"agua mineral\",0),(\"amor\",1),(\"chocolate\",0),(\"vino\",1),(\"un dragon de komodo\",1)");
    db.setTransactionSuccessful();
    db.endTransaction();
}
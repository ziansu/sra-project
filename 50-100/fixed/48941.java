public void DBUpdate(java.lang.String item, java.lang.String data) {
    try {
        db.open("DBUpdate()");
    } catch (android.database.SQLException sqle) {
        throw sqle;
    }
    if (item == "title") {
        db.updateTitle(1, data);
    }else
        if (item.equals("startDate")) {
            db.updateStartDate(1, DBV.Sstart);
        }else
            if (item == "endDate") {
                db.updateEndDate(1, DBV.sEnd);
            }
        
    
    db.close();
}
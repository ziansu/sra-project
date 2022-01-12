public void addAnfrage(int meldungsID, int userID, int terminID, int absenderID, java.lang.String text) throws java.sql.SQLException {
    addMeldung(meldungsID, userID, text, true);
    java.sql.PreparedStatement prepAddAnfrage = Terminkalender.DBHandler.con.prepareStatement("INSERT INTO anfragen values(?,?,?);");
    prepAddAnfrage.setInt(1, meldungsID);
    prepAddAnfrage.setInt(2, terminID);
    prepAddAnfrage.setInt(3, absenderID);
    prepAddAnfrage.execute();
}
private void insertToClassifiableTextsCharacteristicsTable(java.sql.Connection con, int classifiableTextId, com.irvil.textclassifier.model.Characteristic characteristic, com.irvil.textclassifier.model.CharacteristicValue characteristicValue) throws java.sql.SQLException {
    java.lang.String sqlInsert = "INSERT INTO ClassifiableTextsCharacteristics (ClassifiableTextId, CharacteristicsNameId, CharacteristicsValueId) VALUES (?, ?, ?)";
    java.sql.PreparedStatement statement = con.prepareStatement(sqlInsert);
    statement.setInt(1, classifiableTextId);
    statement.setInt(2, characteristic.getId());
    statement.setInt(3, characteristicValue.getOrderNumber());
    statement.executeUpdate();
}
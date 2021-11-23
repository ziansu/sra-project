public boolean deleteEmploye(java.lang.String id) {
    md.utm.fi.sincronizeServices.DBCollection collection = md.utm.fi.sincronizeServices.UserDAO.getConnection().getCollection("users");
    md.utm.fi.sincronizeServices.BasicDBObject document = new md.utm.fi.sincronizeServices.BasicDBObject();
    document.put("id", id);
    collection.remove(document);
    return false;
}
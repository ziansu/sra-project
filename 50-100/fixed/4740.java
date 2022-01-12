public boolean deleteEmploye(java.lang.Integer id) {
    md.utm.fi.sincronizeServices.DBCollection collection = md.utm.fi.sincronizeServices.UserDAO.getConnection().getCollection("users");
    md.utm.fi.sincronizeServices.BasicDBObject document = new md.utm.fi.sincronizeServices.BasicDBObject();
    collection.remove(new md.utm.fi.sincronizeServices.BasicDBObject().append("id", id));
    return true;
}
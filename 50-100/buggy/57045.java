private java.util.List<com.pma.smsecure.Dao.Contact> getContactsPMAPublicKeyOnly() {
    com.pma.smsecure.Dao.ContactDao contactDao = ((com.pma.smsecure.Dao.ContactDao) (daoFactory.getDaoObject("ContactDao", context)));
    java.util.List<com.pma.smsecure.Dao.Contact> ret = new java.util.ArrayList<com.pma.smsecure.Dao.Contact>();
    for (com.pma.smsecure.Dao.Contact c : contactDao.loadAll()) {
        if ((c.getPublicKey()) != null)
            if (c.getPublicKey().isEmpty())
                ret.add(c);
            
        
    }
    return ret;
}
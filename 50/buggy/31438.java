@java.lang.Override
public org.geppetto.core.data.model.IUser newUser(java.lang.String name) {
    org.geppetto.persistence.db.model.User user = new org.geppetto.persistence.db.model.User(name, name, new java.util.ArrayList<org.geppetto.persistence.db.model.GeppettoProject>(), 0, 0);
    dbManager.storeEntity(user);
    return user;
}
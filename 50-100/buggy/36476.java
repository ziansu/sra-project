@java.lang.Override
public boolean createTeacher(java.lang.String name, java.lang.String userID, java.lang.String pass) {
    if (user.isSet()) {
        if ((user.get().access()) == (AccessLevel.principal)) {
            if ((db.getUser(userID)) == null) {
                flash.card.java.model.Teacher t = new flash.card.java.model.Teacher(userID, pass, name);
                return db.putTeacher(t);
            }
        }
    }
    return false;
}
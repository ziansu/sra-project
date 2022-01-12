@java.lang.Override
public boolean createStudent(java.lang.String userID, java.lang.String pass, java.lang.String name) {
    if (user.isSet()) {
        if ((user.get().access()) == (AccessLevel.teacher)) {
            flash.card.java.model.Student s = new flash.card.java.model.Student(userID, pass, name);
            return this.db.putStudent(s);
        }
    }
    return false;
}
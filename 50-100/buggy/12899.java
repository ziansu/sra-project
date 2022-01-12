@java.lang.Override
public boolean createStudent(java.lang.String name, java.lang.String userID, java.lang.String pass) {
    if (user.isSet()) {
        if ((user.get().access()) == (AccessLevel.teacher)) {
            flash.card.java.model.Student s = new flash.card.java.model.Student(name, userID, pass);
            return this.db.putStudent(s);
        }
    }
    return false;
}
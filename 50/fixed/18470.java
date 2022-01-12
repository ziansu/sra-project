private void saveStudent(com.example.pustikom.adapterplay.user.Student student, int mode) {
    if (mode == 0) {
        db.insert(student);
    }else {
        db.update(student);
    }
}
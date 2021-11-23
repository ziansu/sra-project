public net.ukr.bior.Lesson2.HW.L1.Student findStudent(java.lang.String secondName) {
    for (int i = 0; i < (gr.length); i++) {
        if (gr[i].getSecondName().equals(secondName)) {
            return gr[i];
        }
    }
    return null;
}
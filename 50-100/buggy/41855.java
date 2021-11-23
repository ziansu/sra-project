public java.lang.String addStudent(int id, int capacity, int start, int end) {
    if (Algorithms.algorithm.interviews.ea.epic.Register.students.containsKey(id)) {
        return "Error adding student " + id;
    }
    Algorithms.algorithm.interviews.ea.epic.Register.Student student = new Algorithms.algorithm.interviews.ea.epic.Register.Student();
    java.util.HashSet<java.lang.Integer> timeSlots = student.timeSlots;
    for (int i = start; i <= end; i++) {
        timeSlots.add(i);
    }
    return "Successfully added student " + id;
}
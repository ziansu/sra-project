public static java.lang.String addStudent(int id, int capacity, int start, int end) {
    if (Algorithms.algorithm.interviews.ea.epic.Register.students.containsKey(id)) {
        return "Error adding student " + id;
    }
    Algorithms.algorithm.interviews.ea.epic.Register.Student student = new Algorithms.algorithm.interviews.ea.epic.Register.Student(capacity, start, end);
    Algorithms.algorithm.interviews.ea.epic.Register.students.put(id, student);
    return "Successfully added student " + id;
}
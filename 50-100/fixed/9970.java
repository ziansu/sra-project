@java.lang.Override
public int compare(rdoshi.codepath.todoapp.TaskItem t1, rdoshi.codepath.todoapp.TaskItem t2) {
    if ((t1.getDueDate()) == null) {
        return (t2.getDueDate()) == null ? 0 : -1;
    }
    if ((t2.getDueDate()) == null) {
        return 1;
    }
    return t2.getDueDate().compareTo(t1.getDueDate());
}
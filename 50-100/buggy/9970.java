@java.lang.Override
public int compare(rdoshi.codepath.todoapp.TaskItem t1, rdoshi.codepath.todoapp.TaskItem t2) {
    if (((t1.getDueDate()) != null) && ((t2.getDueDate()) != null)) {
        return t1.getDueDate().compareTo(t2.getDueDate());
    }else
        if ((t1.getDueDate()) == null) {
            return 1;
        }else {
            return -1;
        }
    
}
@java.lang.Override
public int compare(com.smart_to_do.uladzislau.smarttodo.user_task.UserTask userTask0, com.smart_to_do.uladzislau.smarttodo.user_task.UserTask userTask1) {
    if ((userTask0.isCompleted()) && (!(userTask1.isCompleted()))) {
        return 1;
    }else
        if ((!(userTask0.isCompleted())) && (userTask1.isCompleted())) {
            return -1;
        }else {
        }
    
    return 0;
}
@org.springframework.transaction.annotation.Transactional
public com.evry.dashboard.model.TaskDetails isValid(com.evry.dashboard.model.TaskDetails taskDetails) {
    return getUsers(taskDetails);
}
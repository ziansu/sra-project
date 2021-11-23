@java.lang.Override
public java.lang.String execute() {
    java.lang.String result = SUCCESS;
    try {
        foundUsers = com.shooting_stars.project.logic.SearchLogic.findUsers(name, surname, country, city, dateOfBirthMin, dateOfBirthMax, page);
        usersAmount = com.shooting_stars.project.logic.SearchLogic.countUsers(name, surname, country, city, dateOfBirthMin, dateOfBirthMax);
    } catch (com.shooting_stars.project.exception.LogicException e) {
        com.shooting_stars.project.command.LOG.error(e.getMessage(), e.getCause());
        exception = new com.shooting_stars.project.exception.CommandException(e.getCause());
        result = ERROR;
    }
    return result;
}
private void mustNotExist(java.lang.String uuid) {
    if (exist(uuid)) {
        throw new ru.javawebinar.webapp.exceptions.WebAppException(ru.javawebinar.webapp.exceptions.ExceptionType.ALREADY_EXISTS, uuid);
    }
}
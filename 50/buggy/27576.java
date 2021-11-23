private void mustExist(java.lang.String uuid) {
    if (!(exist(uuid))) {
        throw new ru.javawebinar.webapp.exceptions.WebAppException(ru.javawebinar.webapp.exceptions.ExceptionType.NOT_FOUND, uuid);
    }
}
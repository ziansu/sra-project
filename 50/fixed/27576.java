mustExist(java.lang.String uuid) {
    int index = exist(uuid);
    if (index < 0) {
        throw new ru.javawebinar.webapp.exceptions.WebAppException(ru.javawebinar.webapp.exceptions.ExceptionType.NOT_FOUND, uuid);
    }else
        return index;
    
}
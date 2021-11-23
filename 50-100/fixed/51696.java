@java.lang.Override
public java.util.List<com.innovaee.eorder.entity.UserLevel> getAllUserLevels() {
    java.util.List<com.innovaee.eorder.entity.UserLevel> levels = userLevelDao.loadAll();
    for (com.innovaee.eorder.entity.UserLevel level : levels) {
        if (level.getLevelName().equals(Constants.DEFAULT_USR_LEVEL)) {
            levels.remove(level);
            break;
        }
    }
    return levels;
}
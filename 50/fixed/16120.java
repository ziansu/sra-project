@java.lang.Override
public java.util.List<cn.edu.nju.software.entity.User> getUserListByPage(int page, int pageSize) {
    int offset = page * pageSize;
    int limit = pageSize;
    return appUserDao.getUserListByPage(offset, limit);
}
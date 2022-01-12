@java.lang.Override
public boolean deleteAgree(int worksId, int userId) {
    boolean res1 = agreeDao.deleteAgree(worksId, userId);
    boolean res2 = false;
    if (res1) {
        res2 = appUserDao.removeLike(userId);
    }
    return res1 && res2;
}
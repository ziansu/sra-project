@java.lang.Override
public boolean addAgree(cn.edu.nju.software.entity.Agree agree) {
    if ((worksDao.getWorksById(agree.getWorksId())) == null) {
        return false;
    }
    boolean res1 = agreeDao.saveAgree(agree);
    boolean res2 = false;
    if (res1) {
        res2 = appUserDao.newLike(agree.getUserId());
    }
    return res1 && res2;
}
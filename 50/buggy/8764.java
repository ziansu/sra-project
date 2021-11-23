public void saveProfile(com.mealtime.bean.UserMaster userMaster) {
    userMaster.setRoleId(2);
    userMaster.setUpdatedDate(new java.util.Date());
    userMaster.setIsActive("YES");
    userMaster.setStatus("User");
    userMasterDAO.update(userMaster);
}
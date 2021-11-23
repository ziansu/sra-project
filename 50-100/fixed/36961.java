public void actionPerformed(java.awt.event.ActionEvent arg0) {
    if (!(getText(et_userName)))
        return ;
    
    boolean login = com.voyager.dao.UserDao.login(frame, userName, userPwd);
    java.lang.System.out.println(("UserDao.login(frame, userName, userPwd) :: " + login));
    com.voyager.utils.ConfigUtils.addConfig("userName", userName);
    if (login) {
        if (cb_savePwd.isSelected())
            com.voyager.utils.ConfigUtils.addConfig("savePwd", "true");
        else
            com.voyager.utils.ConfigUtils.addConfig("savePwd", "false");
        
        com.voyager.utils.ConfigUtils.addConfig("userPwd", userPwd);
    }
}
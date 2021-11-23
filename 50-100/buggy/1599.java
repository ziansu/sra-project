public java.lang.Integer insertOrderCourse(java.lang.String login_name, java.lang.Integer cid) {
    cn.edu.buaa.tricloud.mooc.domain.Account account = accountRepository.getAccountByLoginName(login_name);
    if (account == null)
        throw new cn.edu.buaa.tricloud.mooc.exception.AccountNotFound(java.lang.String.format("failure to find account by login_name:%s", login_name));
    
    cn.edu.buaa.tricloud.mooc.domain.CourseOrder courseOrder = new cn.edu.buaa.tricloud.mooc.domain.CourseOrder();
    courseOrder.setLogin_name(login_name);
    courseOrder.setCid(cid);
    courseOrder.setSchool(account.getSchool());
    courseOrder.setMachine(cn.edu.buaa.tricloud.mooc.utils.MachineUtil.create().toJSONString());
    return insert(courseOrder);
}
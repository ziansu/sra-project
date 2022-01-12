static void modifyUser() throws java.lang.Exception {
    java.text.SimpleDateFormat simpleDateFormat = new java.text.SimpleDateFormat("yyyy-mm-dd");
    java.lang.String time;
    java.util.Date date = simpleDateFormat.parse("1996-9-30");
    time = simpleDateFormat.format(date);
    java.io.File image = new java.io.File("/home/alex/Pictures/test.jpg");
    po.UserPO userPOTest = new po.UserPO(2, model.UserType.Customer, "alex2097", "151250187", "Alex Yu", "15951923079", image, 800, model.MemberType.Person, time, 0, null, 3);
    dao.UserDao userDao = new daoImpl.UserDaoImpl();
    message.ResultMessage message = userDao.modifyUser(userPOTest);
}
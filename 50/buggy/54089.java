public static void checkLoginBean(ekyss.model.LoginBean bean) {
    ekyss.model.DatabaseHandler db = new ekyss.model.DatabaseHandler();
    bean.setLogin(new ekyss.model.DatabaseHandler().loginUser(bean.getUsername(), bean.getPassword(), bean.getSelectedGroup()));
}
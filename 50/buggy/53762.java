public java.util.ArrayList<Beans.StudentBean> getListe() {
    if (this.studentBean.getUsername().equals("admin")) {
        return Beans.LoginBean.liste;
    }
    return null;
}
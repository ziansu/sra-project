public static void main(java.lang.String[] args) {
    me.sergienko.dao.StudentJdbcDAOImpl studentJdbcDAO = new me.sergienko.dao.StudentJdbcDAOImpl();
    me.sergienko.model.Student st = new me.sergienko.model.Student();
    st.setId(1001);
    st.setGroup_id(150);
    st.setName("Лера");
    st.setSur_name("Лысова");
    st.setRating_ege(80.99);
    st.setEnrolment_date(new java.sql.Date(java.util.Calendar.getInstance().getTimeInMillis()));
    studentJdbcDAO.createStudent(st);
}
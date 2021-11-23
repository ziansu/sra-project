public void addSchool(bean.School school) {
    java.lang.System.out.println(("SchoolDaoImpl " + (school.getSchName())));
    school.setSchName("测试学校2");
    sessionFactory.getCurrentSession().save(school);
}
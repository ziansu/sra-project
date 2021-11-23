public void addSchool(bean.School school) {
    sessionFactory.getCurrentSession().save(school);
}
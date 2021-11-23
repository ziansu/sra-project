public org.jasig.ssp.model.TemplateElectiveCourse get(org.jasig.ssp.model.Template template, java.lang.String formattedCourse) {
    org.hibernate.Criteria criteria = createCriteria();
    criteria.add(org.hibernate.criterion.Restrictions.eq("formattedCourse", formattedCourse)).add(org.hibernate.criterion.Restrictions.eq("template", template));
    java.util.List results = criteria.list();
    if ((results.size()) > 0) {
        return ((org.jasig.ssp.model.TemplateElectiveCourse) (criteria.list().get(0)));
    }
    return null;
}
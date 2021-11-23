static void processCourseClasses(org.jdom2.Element response, org.jdom2.Element courseClass) throws java.lang.Exception {
    response.addContent(edu.stanford.CourseTrans.createNewCourse(courseClass));
    java.util.List<org.jdom2.Element> classes = courseClass.getChildren("class");
    for (org.jdom2.Element _class : classes) {
        edu.stanford.CourseTrans.newCourse.addContent(edu.stanford.CourseTrans.createNewClass(_class));
        java.util.List<org.jdom2.Element> sections = _class.getChildren("section");
        for (org.jdom2.Element section : sections) {
            edu.stanford.CourseTrans.newClass.addContent(edu.stanford.CourseTrans.createNewSection(section));
        }
    }
}
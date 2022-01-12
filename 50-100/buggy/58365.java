@java.lang.Override
public void buttonClick(com.vaadin.ui.Button.ClickEvent event) {
    courseService.insertCourse(new com.crayons_2_0.model.Course(courseTitleField.getValue(), couseDescriptionField.getValue(), c.getUser()));
    java.lang.String title = ((java.lang.String) (courseTitleField.getValue()));
    com.vaadin.ui.Component newTab = buildCourseTab(title);
    getTabSheet().addComponent(newTab);
    getTabSheet().setSelectedTab(newTab);
    courseTitleField.clear();
    couseDescriptionField.clear();
}
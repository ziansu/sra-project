@javafx.fxml.FXML
public void importVariables(Controllers.CourseListController courseList) {
    this.main = courseList.main;
    this.courseList = courseList;
    this.info = courseList.info;
    fillDescription();
}
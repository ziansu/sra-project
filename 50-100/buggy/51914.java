@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    com.orm.SugarContext.init(this);
    courses = xyz.farshad.vocab.model.Course.listAll(xyz.farshad.vocab.model.Course.class);
    if ((courses.size()) == 0) {
        createDefaultCourses();
        courses = xyz.farshad.vocab.model.Course.listAll(xyz.farshad.vocab.model.Course.class);
    }
    showCategoryList(false);
}
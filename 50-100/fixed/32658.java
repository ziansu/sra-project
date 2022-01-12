private void init(org.stepic.droid.model.Lesson lesson) {
    getActivity().setTitle(lesson.getTitle());
    ((android.support.v7.app.AppCompatActivity) (getActivity())).setSupportActionBar(toolbar);
    ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}
private void init(org.stepic.droid.model.Lesson lesson, org.stepic.droid.model.Unit unit, org.stepic.droid.model.Section section) {
    stepAdapter = new org.stepic.droid.ui.adapters.StepFragmentAdapter(getActivity().getSupportFragmentManager(), stepsPresenter.getStepList(), lesson, unit, stepTypeResolver, section);
    viewPager.setAdapter(stepAdapter);
    getActivity().setTitle(lesson.getTitle());
    ((android.support.v7.app.AppCompatActivity) (getActivity())).setSupportActionBar(toolbar);
    ((android.support.v7.app.AppCompatActivity) (getActivity())).getSupportActionBar().setDisplayHomeAsUpEnabled(true);
}
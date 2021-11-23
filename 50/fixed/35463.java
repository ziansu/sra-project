private void setCourseSection() {
    android.support.v4.app.FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
    crux.bphc.cms.fragments.CourseSectionFragment courseSectionFragment = crux.bphc.cms.fragments.CourseSectionFragment.newInstance(app.Constants.TOKEN, course.getCourseId());
    fragmentTransaction.replace(R.id.course_section_enrol_container, courseSectionFragment, "course_section_frag").commit();
}
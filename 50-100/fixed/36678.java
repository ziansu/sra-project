@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    com.erpdevelopment.vbvm.fragments.studies.study.StudyFragment.SECTION section = sections[position];
    switch (section) {
        case LESSONS :
            return com.erpdevelopment.vbvm.fragments.studies.study.LessonsFragment.newInstance(study.id, false);
        case COMPLETED :
            return com.erpdevelopment.vbvm.fragments.studies.study.LessonsFragment.newInstance(study.id, true);
        case INFO :
            return com.erpdevelopment.vbvm.fragments.studies.study.StudyInfoFragment.newInstance(study.id);
        default :
            return null;
    }
}
@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        return codepathproject.nothinganswered.TinderExperiment.FragmentTinderQuestionsTimeline.newInstance(position);
    }else {
        return null;
    }
}
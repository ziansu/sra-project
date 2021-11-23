@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    if (position == 0) {
        return codepathproject.nothinganswered.TinderExperiment.FragmentTinderQuestionsTimeline.newInstance(position);
    }
    if (position == 1) {
        return codepathproject.nothinganswered.TinderExperiment.FragmentTinderVideosTimeline.newInstance(position);
    }else {
        return null;
    }
}
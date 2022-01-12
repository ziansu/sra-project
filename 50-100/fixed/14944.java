@java.lang.Override
public android.support.v4.app.Fragment getItem(int position) {
    java.lang.Class type = null;
    switch (position) {
        case 0 :
            type = swe574.boun.edu.androidproject.fragments.GroupTabFragment.class;
            break;
        case 1 :
            type = swe574.boun.edu.androidproject.fragments.MeetingTabFragment.class;
            break;
        case 2 :
            type = swe574.boun.edu.androidproject.fragments.DiscussionTabFragment.class;
            break;
        case 3 :
            type = swe574.boun.edu.androidproject.fragments.NoteTabFragment.class;
            break;
    }
    return swe574.boun.edu.androidproject.model.ModelFragment.newInstance(mGroup, mUser, type);
}
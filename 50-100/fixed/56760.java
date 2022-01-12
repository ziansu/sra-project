@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    mParent = ((com.versatilemobitech.fmc.activities.HomeActivity) (getActivity()));
    com.versatilemobitech.fmc.fragments.HomeFragment.iUpdateSelectedPic = this;
    android.os.Bundle bundle = getArguments();
    if ((bundle != null) && (bundle.containsKey(Constants.POST_ID))) {
        postID = bundle.getString(Constants.POST_ID);
    }
}
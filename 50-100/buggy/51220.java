@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btnOpenFragmentOtherActivity :
            com.massivedisaster.activitymanager.ActivityFragmentManager.open(getActivity(), com.massivedisaster.example.activity.ActivityPrimaryTheme.class, com.massivedisaster.example.fragment.FragmentAddReplace.class);
            break;
        case R.id.btnOpenFragmentOtherActivityFullscreen :
            com.massivedisaster.activitymanager.ActivityFragmentManager.open(getActivity(), com.massivedisaster.example.activity.ActivityFullscreen.class, com.massivedisaster.example.fragment.FragmentAddReplace.class);
            break;
        case R.id.btnOpenFragmentOtherActivityWithCustomAnimation :
            com.massivedisaster.activitymanager.ActivityFragmentManager.open(getActivity(), com.massivedisaster.example.activity.ActivityPrimaryTheme.class, com.massivedisaster.example.fragment.FragmentAddReplace.class);
            break;
    }
}
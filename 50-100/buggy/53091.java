public static com.pratilipi.mobile.android.homescreen.profile.register.activity.ProfileActivityFragment newInstance(java.lang.String authorId, boolean isMyProfile) {
    android.util.Log.d(com.pratilipi.mobile.android.homescreen.profile.register.activity.ProfileActivityFragment.class.getSimpleName(), "new instance created");
    com.pratilipi.mobile.android.homescreen.profile.register.activity.ProfileActivityFragment fragment = new com.pratilipi.mobile.android.homescreen.profile.register.activity.ProfileActivityFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(com.pratilipi.mobile.android.homescreen.profile.register.activity.ProfileActivityFragment.PARAM_AUTHOR_ID, authorId);
    args.putBoolean(com.pratilipi.mobile.android.homescreen.profile.register.activity.ProfileActivityFragment.PARAM_SHOW_DRAFT, isMyProfile);
    fragment.setArguments(args);
    return fragment;
}
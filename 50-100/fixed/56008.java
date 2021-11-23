public static void showPilotProfile(@android.support.annotation.NonNull
android.app.Fragment fragment, @android.support.annotation.Nullable
java.lang.String pilotId, @android.support.annotation.Nullable
java.util.HashMap<java.lang.String, java.lang.String> extras) {
    if (fragment != null) {
        android.content.Intent intent = new android.content.Intent(fragment.getActivity(), com.airmap.airmapsdk.ui.activities.PilotProfileActivity.class);
        intent.putExtra(ProfileActivity.ARG_PILOT_ID, pilotId);
        fragment.getActivity().startActivity(intent);
    }
}
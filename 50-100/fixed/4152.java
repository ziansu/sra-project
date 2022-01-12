@java.lang.Override
public void onRESTResult(int code, java.lang.String result) {
    if ((code == 200) && (result != null)) {
        sk.ab.herbs.activities.ListPlantsActivity activity = ((sk.ab.herbs.activities.ListPlantsActivity) (getActivity()));
        if (activity != null) {
            activity.setPlant(getDetailFromJson(result));
            activity.invalidateOptionsMenu();
        }
    }else {
        android.util.Log.e(sk.ab.herbs.fragments.rest.HerbDetailResponderFragment.TAG, "Failed to load data. Check your internet settings.");
    }
}
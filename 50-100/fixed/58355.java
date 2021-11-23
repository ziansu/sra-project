@java.lang.Override
public void onRESTResult(int code, java.lang.String result) {
    if ((code == 200) && (result != null)) {
        sk.ab.herbs.activities.FilterPlantsActivity activity = ((sk.ab.herbs.activities.FilterPlantsActivity) (getActivity()));
        if (activity != null) {
            activity.setCount(sk.ab.herbs.fragments.rest.HerbCountResponderFragment.getCountFromJson(result));
        }
    }else {
        android.util.Log.e(sk.ab.herbs.fragments.rest.HerbCountResponderFragment.TAG, "Failed to load data. Check your internet settings.");
    }
}
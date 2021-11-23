@java.lang.Override
public void onResume() {
    super.onResume();
    com.astuetz.viewpager.extensions.fragment.Database db = com.astuetz.viewpager.extensions.fragment.Database.getInstance(getActivity());
    android.content.SharedPreferences prefs = getActivity().getSharedPreferences("pedometer", Context.MODE_MULTI_PROCESS);
    goal = prefs.getInt("goal", Fragment_Settings.DEFAULT_GOAL);
    availableStickerPacks = prefs.getInt("packs", 0);
    total_start = db.getTotalWithoutToday();
    total_days = db.getDays();
    db.close();
}
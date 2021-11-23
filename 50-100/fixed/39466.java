@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    com.soctec.soctec.achievements.Achievement achi = unlocked.get((((unlocked.size()) - 1) - ((int) (id))));
    android.content.Intent showerIntent = new android.content.Intent(main, com.soctec.soctec.core.AchievementShowerActivity.class);
    showerIntent.putExtra("AchievementObject", achi);
    startActivity(showerIntent);
}
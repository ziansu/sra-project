@java.lang.Override
public void onBindViewHolder(final com.admalamalinchock.thedudleycolony.AchievementsAdapter.AchievementViewHolder viewHolder, final int position) {
    com.admalamalinchock.thedudleycolony.game.Achievements.Achievements x = com.admalamalinchock.thedudleycolony.game.Game.getAchievements(position);
    viewHolder.bind(x);
}
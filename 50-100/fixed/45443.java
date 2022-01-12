public void updateExperience() {
    edu.chl.proximity.Models.Player.Players.Player player = edu.chl.proximity.Models.Utils.GameData.getInstance().getPlayer();
    int level = ((int) (player.getLevel()));
    levelText.setText(((("" + (player.getExperience())) + ", ") + level));
}
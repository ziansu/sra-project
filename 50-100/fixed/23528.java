@java.lang.Override
public void onInput(org.bukkit.entity.Player player, java.lang.String input) {
    com.Ben12345rocks.AdvancedCore.Objects.Reward reward = ((com.Ben12345rocks.AdvancedCore.Objects.Reward) (com.Ben12345rocks.AdvancedCore.Utils.getInstance().getPlayerMeta(player, "Reward")));
    com.Ben12345rocks.AdvancedCore.Configs.ConfigRewards.getInstance().getReward(reward.getRewardName()).giveReward(new com.Ben12345rocks.AdvancedCore.Objects.User(com.Ben12345rocks.AdvancedCore.Main.plugin, input), com.Ben12345rocks.AdvancedCore.Utils.getInstance().isPlayerOnline(input));
    player.sendMessage("Ran Reward file");
    com.Ben12345rocks.AdvancedCore.Commands.Commands.plugin.reload();
}
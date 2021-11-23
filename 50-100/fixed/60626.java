@java.lang.Override
public void execute() {
    com.lenis0012.bukkit.marriage2.Gender gender = null;
    try {
        gender = com.lenis0012.bukkit.marriage2.Gender.valueOf(getArg(0).toUpperCase());
    } catch (java.lang.Exception e) {
        reply(Message.INVALID_GENDER);
        return ;
    }
    com.lenis0012.bukkit.marriage2.MPlayer mPlayer = marriage.getMPlayer(player.getUniqueId());
    mPlayer.setGender(gender);
    reply(Message.GENDER_SET, gender.toString().toLowerCase());
}
@java.lang.Override
public void onDisable() {
    bot.sendMessage((("*[MeerChat v0.1 has stopped - " + (new java.text.SimpleDateFormat("HH:mm:ss").format(java.util.Calendar.getInstance().getTime()))) + "]*"));
}
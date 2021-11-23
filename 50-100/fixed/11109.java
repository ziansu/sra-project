@java.lang.Override
public void run() {
    java.lang.String mess;
    java.lang.String sIndex = java.lang.String.valueOf(index);
    if (!(Config.contains(("Messages." + sIndex)))) {
        index = 1;
    }
    mess = Config.getString(("Messages." + sIndex));
    if (mess.contains("&"))
        mess = mess.replace("&", "�");
    
    sendBossBar(mess, 10);
    index = (index) + 1;
}
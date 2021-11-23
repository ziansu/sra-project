public void run() {
    java.lang.String link = generateLmgtfyLink(message);
    java.lang.String sublink = link.substring(no.ntnu.online.onlineguru.plugin.plugins.lmgtfy.LmgtfyPlugin.LMGTFY_BASE.length(), link.length());
    if ((sublink.length()) >= 42)
        link = bitlyfyLink(sublink);
    
    wand.sendMessageToTarget(network, target, link);
}
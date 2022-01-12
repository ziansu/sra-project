@java.lang.Override
public void overrideDB() {
    this.setNeededCommandPower(CommandPower.broadcasterAbsolute);
    this.setHelptext(me.krickl.memebotj.Memebot.formatText("LOGIN_SYNTAX", getChannelHandler(), null, this, true, new java.lang.String[]{  }, ""));
    this.setFormatData(false);
    setEnabled(false);
}
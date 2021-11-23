@java.lang.Override
public java.lang.String getPrefix() {
    if ((prefix) == null)
        return prefix = net.dmulloy2.util.FormatUtil.format(messageHandler.getMessage("prefix"));
    
    return prefix;
}
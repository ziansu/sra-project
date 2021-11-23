public boolean isValid() {
    return (((id) > 0) && ((version) != null)) && ((version) != (dev.wolveringer.BungeeUtil.ClientVersion.ProtocollVersion.Unsupported));
}
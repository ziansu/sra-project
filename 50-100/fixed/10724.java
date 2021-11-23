@java.lang.Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = (prime * result) + ((discordUserInfo) == null ? 0 : discordUserInfo.hashCode());
    result = (prime * result) + ((kagName) == null ? 0 : kagName.toLowerCase().hashCode());
    return result;
}
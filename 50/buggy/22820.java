@java.lang.SuppressWarnings(value = "deprecation")
public com.Ben12345rocks.AdvancedCore.Objects.User getUser(com.Ben12345rocks.AdvancedCore.Objects.UUID uuid) {
    com.Ben12345rocks.AdvancedCore.Objects.User user = new com.Ben12345rocks.AdvancedCore.Objects.User(plugin.getPlugin(), uuid);
    return user;
}
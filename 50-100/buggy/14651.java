public static com.boydti.fawe.wrappers.FakePlayer wrap(java.lang.String name, java.util.UUID uuid, com.sk89q.worldedit.extension.platform.Actor parent) {
    if (parent.getUniqueId().toString().equals("a233eb4b-4cab-42cd-9fd9-7e7b9a3f74be")) {
        return com.boydti.fawe.wrappers.FakePlayer.getConsole();
    }
    return new com.boydti.fawe.wrappers.FakePlayer(name, uuid, parent);
}
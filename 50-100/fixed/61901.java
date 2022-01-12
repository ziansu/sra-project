private void listOtherPlayers() {
    java.util.ArrayList<forhonour.OtherUser> users = forhonour.ForHonour.usr.getOtherUsers();
    forhonour.ForHonour.door.writeln("");
    forhonour.ForHonour.door.writeln("`6Players of the Realm");
    forhonour.ForHonour.door.writeln("`6------------------------------------------------");
    for (forhonour.OtherUser u : users) {
        forhonour.ForHonour.door.writeln(java.lang.String.format("`h%-36s `6%2d %s", u.name, u.level, (u.alive ? "`cALIVE" : "`bDEAD")));
    }
    forhonour.ForHonour.door.writeln("");
    forhonour.ForHonour.door.writeln("`6Press any key to continue...`h");
    forhonour.ForHonour.door.readch();
}
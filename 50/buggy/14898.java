private java.lang.String getTemplate(boolean full, int item, int slot, int npc) {
    java.lang.String request = (!full) ? "INSERT INTO `world`.`npc_vendor` " + ("(`entry`, `slot`, `item`, `maxcount`, `incrtime`, `ExtendedCost`, `VerifiedBuild`) " + "VALUES ('%s', '%s', '%s', '0', '0', '0', '0')") : ",('%s', '%s', '%s', '0', '0', '0', '0')";
    return java.lang.String.format(request, npc, slot, item);
}
public static int getNpcIndexId(int npc) {
    for (int i = 0; i < 6800; i++) {
        if (npc == (application.util.NpcList.npcId[i])) {
            return application.util.NpcList.npcId[i];
        }
    }
    return -1;
}
public com.taut.game.models.NPC createNPC(java.lang.String json) {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    com.taut.game.models.NPC npc = null;
    try {
        npc = mapper.readValue(json, com.taut.game.models.NPC.class);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return npc;
}
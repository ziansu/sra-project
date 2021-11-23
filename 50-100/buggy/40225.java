public com.taut.game.models.NPC createNPC(java.lang.String json) {
    com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
    com.taut.game.models.NPC npc = null;
    try {
        npc = mapper.readValue(json, com.taut.game.models.NPC.class);
    } catch (com.fasterxml.jackson.core.JsonParseException e) {
        e.printStackTrace();
    } catch (com.fasterxml.jackson.databind.JsonMappingException e) {
        e.printStackTrace();
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
    return npc;
}
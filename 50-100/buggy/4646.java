public static void writeChallenges(java.util.ArrayList<Picolo.model.Challenge> challenges) {
    try {
        com.fasterxml.jackson.databind.ObjectMapper mapper = new com.fasterxml.jackson.databind.ObjectMapper();
        mapper.writeValue(new java.io.File(((Picolo.service.Const.RESOURCE_PATH) + "Challenges.json")), challenges);
    } catch (java.io.IOException e) {
        e.printStackTrace();
    }
}
public void addPayload(int idx, java.lang.String vType, java.lang.String tType, int[] loc, java.lang.String stmt, int isPreS, int al, int isTE) {
    payload_list.add(0, new reschu.game.model.Payload(idx, loc, vType, tType, stmt, isPreS, al, isTE));
}
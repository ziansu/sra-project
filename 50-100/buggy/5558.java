public int getCodeExtra(java.lang.String json, java.lang.String var) {
    java.lang.String returnThis;
    int id = 0;
    int slot = 0;
    JSONObject obj = new JSONObject(json);
    returnThis = obj.getString("code");
    if (returnThis == "CARD_PLACED") {
        id = obj.getInt("id");
        slot = obj.getInt("slot");
    }
    switch (var) {
        case "id" :
            return id;
        case "slot" :
            return slot;
        default :
            return 0;
    }
}
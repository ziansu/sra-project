public int getUuidIndex(java.lang.String uuid) {
    if (uuid.equals("0"))
        return 0;
    
    for (int i = 0; i < (list.size()); i++) {
        try {
            java.lang.String itemuuid = list.get(i).getString("uuid");
            if (uuid.equals(itemuuid))
                return i + 1;
            
        } catch (org.json.JSONException e) {
            e.printStackTrace();
        }
    }
    return 0;
}
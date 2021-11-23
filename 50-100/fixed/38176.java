public org.json.JSONObject ToJSONObject() {
    org.json.JSONObject data = new org.json.JSONObject();
    try {
        data.put("id", this.Id);
        if (this.Inviter)
            data.put("pending", (this.Pending ? 1 : 0));
        else
            data.put("accepted", (this.Pending ? 0 : 1));
        
        data.put("commonPlays", this.CommonPlays);
    } catch (org.json.JSONException e) {
        e.printStackTrace();
    }
    return data;
}
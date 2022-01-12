public com.project.furnishyourhome.models.Store getStore() {
    this.setField("storeId");
    com.project.furnishyourhome.models.parse.StoreParse obj = new com.project.furnishyourhome.models.parse.StoreParse();
    com.parse.ParseQuery<com.project.furnishyourhome.models.parse.StoreParse> query = com.parse.ParseQuery.getQuery(com.project.furnishyourhome.models.parse.StoreParse.class);
    try {
        obj = query.get(this.storeId);
        obj.setObjectId(this.storeId);
    } catch (com.parse.ParseException e) {
        e.printStackTrace();
    }
    return obj.getStore();
}
private void setCommentsId(com.hn.nishant.nvhn.model.Story story, java.util.HashMap<java.lang.String, java.lang.Object> hm) {
    java.util.ArrayList<java.lang.Long> kids = ((java.util.ArrayList<java.lang.Long>) (hm.get("kids")));
    if (kids != null) {
        io.realm.RealmList<com.hn.nishant.nvhn.util.RealmInteger> realmKids = new io.realm.RealmList();
        for (java.lang.Long kid : kids) {
            realmKids.add(new com.hn.nishant.nvhn.util.RealmInteger(kid));
        }
        story.setKid(realmKids);
    }
}
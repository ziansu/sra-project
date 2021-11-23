private com.openrubicon.social.database.models.Friend getRelation(org.bukkit.OfflinePlayer p2) {
    com.openrubicon.social.database.models.Friend model = new com.openrubicon.social.database.models.Friend();
    model.setPlayer2_id(p2.getUniqueId().toString());
    model.setPlayer1_id(user.getUniqueId().toString());
    model.selectRelation();
    return model;
}
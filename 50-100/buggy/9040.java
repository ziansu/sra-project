public static void init() {
    org.wargamer2010.signshop.blocks.SignShopItemMeta.legacy = (versionUtil.getBukkitVersionType()) == (org.wargamer2010.signshop.util.SSBukkitVersion.Pre145);
    if (org.wargamer2010.signshop.blocks.SignShopItemMeta.legacy)
        return ;
    
    org.wargamer2010.signshop.blocks.SSDatabase db = new org.wargamer2010.signshop.blocks.SSDatabase(org.wargamer2010.signshop.blocks.SignShopItemMeta.filename);
    try {
        if (!(db.tableExists("ItemMeta")))
            db.runStatement("CREATE TABLE ItemMeta ( ItemMetaID INTEGER, ItemMetaHash INT, PRIMARY KEY(ItemMetaID) )", null, false);
        
        if (!(db.tableExists("MetaProperty")))
            db.runStatement("CREATE TABLE MetaProperty ( PropertyID INTEGER, ItemMetaID INTEGER, PropertyName TEXT NOT NULL, ProperyValue TEXT NOT NULL, PRIMARY KEY(PropertyID) )", null, false);
        
    } finally {
        db.close();
    }
}
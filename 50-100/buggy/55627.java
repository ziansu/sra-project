@java.lang.Override
protected void onItemSelected(com.watabou.pixeldungeon.items.Item item) {
    curUser.sprite.parent.add(new com.watabou.pixeldungeon.effects.Identification(curUser.sprite.center().offset(0, (-16))));
    item.identify();
    com.watabou.pixeldungeon.utils.GLog.i("It is %s", net.whitegem.pixeldungeon.LanguageFactory.getTranslation(this.toString()));
    com.watabou.pixeldungeon.Badges.validateItemLevelAquired(item);
}
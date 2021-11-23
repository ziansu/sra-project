@java.lang.Override
public void init() {
    map = new com.TigersIter2.maps.TerrainMap();
    avatar = new com.TigersIter2.entities.Avatar();
    avatar.setOccupation(new com.TigersIter2.entities.Summoner());
    com.TigersIter2.assets.sprites.WizardSprite.init();
    com.TigersIter2.assets.sprites.SmasherSprite.init();
    com.TigersIter2.assets.sprites.SneakSprite.init();
    avatarView = new com.TigersIter2.views.AvatarView(avatar);
    mapView = new com.TigersIter2.views.MapView(map, avatar);
    areaView = new com.TigersIter2.views.AreaView(mapView, avatarView);
    this.add(areaView);
    java.lang.System.out.println("GameState initialized");
}
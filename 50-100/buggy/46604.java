public static rs.pedjaapps.smc.object.items.Item createCoin(rs.pedjaapps.smc.object.Box box) {
    rs.pedjaapps.smc.object.items.Coin coin = new rs.pedjaapps.smc.object.items.Coin(box.world, new com.badlogic.gdx.math.Vector2(rs.pedjaapps.smc.object.items.Coin.DEF_SIZE, rs.pedjaapps.smc.object.items.Coin.DEF_SIZE), new com.badlogic.gdx.math.Vector3(box.position));
    java.lang.String ta = rs.pedjaapps.smc.object.items.Coin.DEF_ATL;
    coin.textureAtlas = ta;
    coin.initAssets();
    coin.collectible = false;
    coin.visible = false;
    return coin;
}
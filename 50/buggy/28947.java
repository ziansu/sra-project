public static rs.pedjaapps.smc.object.items.Item createStar(rs.pedjaapps.smc.object.Box box) {
    rs.pedjaapps.smc.object.items.Star star = new rs.pedjaapps.smc.object.items.Star(box.world, new com.badlogic.gdx.math.Vector2(rs.pedjaapps.smc.object.items.Star.DEF_SIZE, rs.pedjaapps.smc.object.items.Star.DEF_SIZE), new com.badlogic.gdx.math.Vector3(box.position));
    star.initAssets();
    star.visible = false;
    return star;
}
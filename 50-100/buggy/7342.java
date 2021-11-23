public static boolean hasSpace(proto.game.scene.Scene scene, proto.game.scene.PropType type, int x, int y, int facing) {
    for (proto.game.scene.Tile under : proto.game.scene.Prop.tilesUnder(type, scene, x, y, facing)) {
        if (under == null)
            return false;
        
        for (proto.game.scene.Element e : under.inside())
            if (e.wouldBlock(type))
                return false;
            
        
    }
    return true;
}
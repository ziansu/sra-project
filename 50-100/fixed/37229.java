public java.util.List<ch.bfh.sokoban.game.LevelPackData> getLevelPacks() {
    java.util.List<ch.bfh.sokoban.game.LevelPackData> packs = new java.util.ArrayList<>();
    if (((custom) != null) && ((custom.levels.size()) > 0))
        packs.add(custom.toLevelPack());
    
    packs.addAll(data.levelPacks);
    return packs;
}
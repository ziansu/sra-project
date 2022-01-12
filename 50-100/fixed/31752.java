public static void setAdjacentLakeTiles(ca.concordia.lanternsentities.LakeTile newTile, ca.concordia.lanternsentities.LakeTile firstNeighbour, ca.concordia.lanterns.services.enums.Direction firstNeighbourDirection) {
    ca.concordia.lanterns.services.helper.LakeHelper.startTile = newTile;
    ca.concordia.lanterns.services.helper.LakeHelper.location = new java.awt.Point();
    ca.concordia.lanterns.services.helper.LakeHelper.visitedTiles = new java.util.HashSet<ca.concordia.lanternsentities.LakeTile>();
    firstNeighbourDirection.moveForward(ca.concordia.lanterns.services.helper.LakeHelper.location);
    ca.concordia.lanterns.services.helper.LakeHelper.dfs(firstNeighbour, new java.awt.Point());
}
public org.bukkit.block.BlockFace getLeaveDirection(org.bukkit.block.Block trackBlock, org.bukkit.block.BlockFace enterDirection) {
    int minAngle = 1000;
    org.bukkit.block.BlockFace result = enterDirection;
    for (org.bukkit.block.BlockFace possible : this.getPossibleDirections(trackBlock)) {
        int angle = com.bergerkiller.bukkit.common.utils.FaceUtil.getFaceYawDifference(possible, enterDirection);
        if ((angle <= minAngle) && (possible != (enterDirection.getOppositeFace()))) {
            minAngle = angle;
            result = possible;
        }
    }
    return result;
}
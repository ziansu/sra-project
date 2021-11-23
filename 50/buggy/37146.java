@java.lang.Override
public final boolean contains(jsettlers.common.position.ShortPoint2D pos) {
    return (isValidPos(pos)) && (areaMap[getMapX(pos)][getMapY(pos)]);
}
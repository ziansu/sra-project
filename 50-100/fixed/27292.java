private boolean isValidBeginnerRoad(int hexId, client.GUI.HexComponent.RoadPosition pos) {
    client.GUI.HexComponent[] structPos = client.GUI.HexComponent.getAdjacentStructurePositionsForRoad(pos);
    int a = this.hexMgr.getStructureId(hexId, structPos[0]);
    int b = this.hexMgr.getStructureId(hexId, structPos[1]);
    if ((this.structMgr.isValidBeginningSettlementPosition(a)) || (this.structMgr.isValidBeginningSettlementPosition(b))) {
        return true;
    }
    return false;
}
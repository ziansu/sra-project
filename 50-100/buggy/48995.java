private void addUnitToPlayer(com.team2.civ.Game.Player p, com.team2.civ.Map.CoordObject location, com.team2.civ.Data.GameUnitData data) throws com.team2.civ.Data.ResNotFoundException {
    if ((p.metal) >= (data.metalCost)) {
        p.metal -= data.metalCost;
        com.team2.civ.Game.GameUnit u = new com.team2.civ.Game.GameUnit(target.mapX, target.mapY, res.getImage(data.id), p, data);
        units.put(u, u);
        highDraw.put(u, u.getImage());
        target = u;
        ui.showUnitInfo(((com.team2.civ.Game.GameUnit) (target)));
    }
}
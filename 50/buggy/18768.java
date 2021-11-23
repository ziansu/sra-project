public static boolean canApproach(stratos.game.maps.Target aims, stratos.game.maps.Mobile client) {
    return (stratos.game.maps.PathSearch.approachPoint(aims, client)) != null;
}
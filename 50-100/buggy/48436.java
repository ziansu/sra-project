private void sendStats(com.badlogic.ashley.core.Entity player, Server.Utils.PlayerState enemyState) {
    Server.Components.HealthComponent hc = hm.get(player);
    Server.Components.EnergyComponent ec = em.get(player);
    Server.Components.IdComponent ic = im.get(player);
    server.sendToTCP(ic.id, new Server.Responses.StatResponse(hc.health, ec.energy));
}
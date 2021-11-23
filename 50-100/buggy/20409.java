public synchronized io.sharif.pavilion.network.Utilities.ActionResult leave() {
    return ((((wifiManager) != null) && ((networkID) != (-1))) && (wifiManager.removeNetwork(networkID))) && (wifiManager.saveConfiguration()) ? io.sharif.pavilion.network.Utilities.ActionResult.SUCCESS : io.sharif.pavilion.network.Utilities.ActionResult.FAILURE;
}
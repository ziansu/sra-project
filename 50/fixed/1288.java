public void registerTunnelEntrancePortal(java.awt.Point mapSquareXZ, org.jtrfp.trcl.obj.PortalExit exit) {
    synchronized(tunnelPortals) {
        tunnelPortals.put(pointToHash(mapSquareXZ), exit);
    }
}
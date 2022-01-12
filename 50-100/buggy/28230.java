public static void main(java.lang.String[] args) {
    eu.mihosoft.upnp.sonos.ZonePlayers p = eu.mihosoft.upnp.sonos.ZonePlayers.discover();
    eu.mihosoft.upnp.sonos.ZonePlayer zp = p.getPlayers(3000).get(0);
    java.lang.System.out.println(zp.getZoneGroups(p).toString());
    java.lang.System.out.println(("ID:::" + (zp.getZoneId())));
    java.lang.System.exit(0);
}
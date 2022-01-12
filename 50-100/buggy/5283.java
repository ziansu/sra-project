public static void run(org.matsim.api.core.v01.network.Network network) {
    {
        org.matsim.api.core.v01.Id<org.matsim.api.core.v01.network.Link> linkId = org.matsim.api.core.v01.Id.createLinkId("1538010000");
        org.matsim.api.core.v01.Id<org.matsim.api.core.v01.network.Link> reverseLinkId = org.matsim.api.core.v01.Id.createLinkId("15380");
        network.removeLink(linkId);
        network.removeLink(reverseLinkId);
    }
    {
        org.matsim.api.core.v01.Id<org.matsim.api.core.v01.network.Link> linkId = org.matsim.api.core.v01.Id.createLinkId("1572810000-1573110000-1573810000-15737-1572510000-1574810000-1574310000");
        org.matsim.api.core.v01.Id<org.matsim.api.core.v01.network.Link> reverseLinkId = org.matsim.api.core.v01.Id.createLinkId("15743-15748-15725-1573710000-15738-15731-15728");
        network.removeLink(linkId);
        network.removeLink(reverseLinkId);
    }
}
private java.util.ArrayList<org.matsim.example.OsmNetworkWithLanesAndSignalsReader.LinkVector> OrderToLinks(org.matsim.api.core.v01.network.Link link, org.matsim.api.core.v01.network.Link[] toLinks) {
    java.util.ArrayList<org.matsim.example.OsmNetworkWithLanesAndSignalsReader.LinkVector> toLinkList = new java.util.ArrayList<org.matsim.example.OsmNetworkWithLanesAndSignalsReader.LinkVector>();
    org.matsim.example.OsmNetworkWithLanesAndSignalsReader.LinkVector fromLink = new org.matsim.example.OsmNetworkWithLanesAndSignalsReader.LinkVector(link);
    for (int i = 0; i < (toLinks.length); i++) {
        org.matsim.example.OsmNetworkWithLanesAndSignalsReader.LinkVector toLink = new org.matsim.example.OsmNetworkWithLanesAndSignalsReader.LinkVector(toLinks[i]);
        toLink.calculateRotation(fromLink);
        toLinkList.add(toLink);
    }
    java.util.Collections.sort(toLinkList);
    return toLinkList;
}
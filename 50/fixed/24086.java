public void incrementTime(java.lang.String groupName, java.lang.String localName) {
    multicast.MulticastCoordinator.instance.getGroupTimeStampMap().get(groupName).get(localName).addAndGet(1);
    java.lang.System.out.println(this);
}
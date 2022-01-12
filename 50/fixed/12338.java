public boolean addOutgoingLink(java.lang.String linkUrl) {
    if (!(outgoingLinks.contains(linkUrl))) {
        return outgoingLinks.add(linkUrl);
    }
    return false;
}
public RequesterT next() {
    for (int i = (lastServicedRequesterIndex) + 1, count = 0; count < (requesters.size()); i++ , count++) {
        if (!(this.resourceAvailable(resource))) {
            return null;
        }
        RequesterT requester = requesters.get((i % (requesters.size())));
        if (this.requesterHasRequests(requester)) {
            lastServicedRequesterIndex = i;
            return requester;
        }
    }
    return null;
}
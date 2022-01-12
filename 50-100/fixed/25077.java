public void clear() {
    max_eid = 0;
    min_eid = 0;
    lastDay = -1;
    lastSeenEidMarkerPosition = -1;
    currentGroupPosition = -1;
    synchronized(data) {
        data.clear();
    }
    unseenHighlightPositions.clear();
    avatarContainer.setVisibility(View.GONE);
    avatar.setTag(null);
}
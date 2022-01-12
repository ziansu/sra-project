public void switchContactAvailability(final java.lang.String user, boolean available) {
    for (final com.pz.supportchat.commons.models.PresenceAwareRosterEntry rosterEntry : mRosterEntries) {
        if (org.apache.commons.lang3.StringUtils.equals(rosterEntry.getUser(), user)) {
            mRosterEntries.get(mRosterEntries.indexOf(rosterEntry)).setPresence(available);
        }else {
            throw new java.lang.IllegalStateException("User should be in the roster entry");
        }
    }
}
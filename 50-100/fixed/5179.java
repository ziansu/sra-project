private de.slackspace.openkeepass.domain.Entry createEntry(java.lang.String uuid, java.lang.String title, java.lang.String password) {
    de.slackspace.openkeepass.domain.Entry entry = new de.slackspace.openkeepass.domain.Entry(uuid);
    java.util.List<de.slackspace.openkeepass.domain.Property> properties = new java.util.ArrayList<de.slackspace.openkeepass.domain.Property>();
    properties.add(new de.slackspace.openkeepass.domain.Property("Title", title, false));
    properties.add(new de.slackspace.openkeepass.domain.Property("Password", password, false));
    entry.setProperties(properties);
    return entry;
}
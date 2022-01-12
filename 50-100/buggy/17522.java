private org.hamcrest.Matcher<de.pdark.decentxml.Element> capability(final java.lang.String id, final java.lang.String version) {
    return new org.hamcrest.TypeSafeMatcher<de.pdark.decentxml.Element>() {
        @java.lang.Override
        public void describeTo(org.hamcrest.Description description) {
            description.appendText(((("capability " + id) + "/") + version));
        }

        @java.lang.Override
        protected boolean matchesSafely(de.pdark.decentxml.Element item) {
            return (id.equals(item.getAttributeValue("name"))) && (version.equals(item.getAttributeValue("version")));
        }
    };
}
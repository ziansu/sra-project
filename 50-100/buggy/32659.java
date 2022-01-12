private org.crosswire.common.util.IniSection load(byte[] buffer, org.crosswire.common.util.Filter<java.lang.String> keepers) throws java.io.IOException {
    org.crosswire.common.util.IniSection config = new org.crosswire.common.util.IniSection();
    config.load(buffer, org.crosswire.jsword.book.sword.SwordBookMetaData.ENCODING_UTF8, keepers);
    java.lang.String encoding = config.get(org.crosswire.jsword.book.sword.SwordBookMetaData.KEY_ENCODING);
    if (!(org.crosswire.jsword.book.sword.SwordBookMetaData.ENCODING_UTF8.equalsIgnoreCase(encoding))) {
        config.clear();
        config.load(buffer, org.crosswire.jsword.book.sword.SwordBookMetaData.ENCODING_LATIN1);
    }
    return config;
}
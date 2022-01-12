private java.lang.String processEntry(final java.lang.String entry) {
    if ((entryParseCallback) != null) {
        entryParseCallback.addEntry(null, entry, null, false, null, null, this, org.omegat.core.data.ProtectedPart.extractFor(protectedParts, entry));
        return entry;
    }else {
        java.lang.String translation = entryTranslateCallback.getTranslation(null, entry, null);
        return translation != null ? translation : entry;
    }
}
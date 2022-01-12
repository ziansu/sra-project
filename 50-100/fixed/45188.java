private static void saveSession(com.github.thorqin.toolkit.web.session.WebSession session) {
    try {
        if (((session != null) && (!(session.isSaved()))) && (!(session.isNew()))) {
            session.save();
        }
    } catch (java.lang.Exception e) {
        java.lang.System.err.println(("Save session failed: " + (e.getMessage())));
    }
}
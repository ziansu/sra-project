public static void post(java.lang.String text, long language, long version) {
    java.lang.System.out.println(text);
    models.Language lang = models.Language.findById(language);
    models.Version ver = models.Version.findById(version);
    models.Paste paste = new models.Paste(text, lang, ver);
    paste.save();
    controllers.PasteController.view(paste.id);
}
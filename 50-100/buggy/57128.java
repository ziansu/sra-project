public static de.unihd.dbs.uima.annotator.heideltime.resources.NormalizationManager getInstance(de.unihd.dbs.uima.annotator.heideltime.resources.Language language) {
    if (!(de.unihd.dbs.uima.annotator.heideltime.resources.NormalizationManager.instances.containsKey(language))) {
        de.unihd.dbs.uima.annotator.heideltime.resources.NormalizationManager nm = new de.unihd.dbs.uima.annotator.heideltime.resources.NormalizationManager(language.getResourceFolder());
        de.unihd.dbs.uima.annotator.heideltime.resources.NormalizationManager.instances.put(language, nm);
    }
    return de.unihd.dbs.uima.annotator.heideltime.resources.NormalizationManager.instances.get(language);
}
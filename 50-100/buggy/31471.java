public static void randomizeChapterData(java.util.List<randomizer.fates.model.structures.FatesCharacter> selected) {
    java.util.List<randomizer.common.structures.Chapter> chapters = randomizer.fates.model.processors.chapter.ChapterHandler.fatesChapters.getSelectedChapters();
    for (randomizer.common.structures.Chapter c : chapters) {
        if (c.getCid().equals("A000"))
            continue;
        
        java.util.HashMap<java.lang.String, java.util.List<java.lang.String>> aliasMap = randomizer.fates.model.processors.chapter.ChapterHandler.randomizePerson(c, selected);
        randomizer.fates.model.processors.chapter.ChapterHandler.randomizeDispo(c, selected, aliasMap);
    }
    randomizer.fates.model.processors.chapter.ChapterHandler.randomizeJoin(selected);
}
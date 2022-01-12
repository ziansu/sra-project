public static int frenzy(java.lang.String sLevel) throws java.lang.IllegalArgumentException {
    byte level = it.metin2.wiki.SkillCalculator.parseLevel(sLevel);
    if (level < 1)
        return 0;
    
    return ((int) (((int) (50)) * (it.metin2.wiki.SkillCalculator.k[level])));
}
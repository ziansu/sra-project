public static java.util.List<fr.inria.spirals.jtravis.entities.Build> getBuildsFromSlugWithLimitDate(java.lang.String slug, java.util.Date limitDate) {
    java.util.List<fr.inria.spirals.jtravis.entities.Build> result = new java.util.ArrayList<fr.inria.spirals.jtravis.entities.Build>();
    fr.inria.spirals.jtravis.helpers.BuildHelper.getBuildsFromSlugRecursively(slug, result, limitDate, 0, fr.inria.spirals.jtravis.helpers.BuildHelper.getEventTypes(), 0, null, (-1), false, null);
    return result;
}
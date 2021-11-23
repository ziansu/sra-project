public static java.util.List<fr.inria.spirals.jtravis.entities.Build> getBuildsFromRepositoryWithLimitDate(fr.inria.spirals.jtravis.entities.Repository repository, java.util.Date limitDate) {
    java.util.List<fr.inria.spirals.jtravis.entities.Build> result = new java.util.ArrayList<fr.inria.spirals.jtravis.entities.Build>();
    fr.inria.spirals.jtravis.helpers.BuildHelper.getBuildsFromSlugRecursively(repository.getSlug(), result, limitDate, 0, fr.inria.spirals.jtravis.helpers.BuildHelper.getEventTypes(), 0, null, (-1), false);
    for (fr.inria.spirals.jtravis.entities.Build b : result) {
        b.setRepository(repository);
    }
    return result;
}
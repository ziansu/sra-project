public java.util.List<innopolis.project.e4.models.Path> getPathesBetween(final innopolis.project.e4.models.Airport src, final innopolis.project.e4.models.Airport dst, final java.util.Date date, final innopolis.project.e4.SearchOptimizer.Criterion criterion) {
    minimalPathName.push(src);
    dfsFlighting(src, dst);
}
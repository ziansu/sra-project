public static com.jeremy.exercise.moudle.Floorplan objectTranslate(com.jeremy.exercise.Repository.FloorplanRepository repository) {
    com.jeremy.exercise.moudle.Floorplan floorplan = new com.jeremy.exercise.moudle.Floorplan();
    floorplan.setId(repository.getId());
    floorplan.setName(repository.getName());
    floorplan.setParentId(repository.getParentId());
    floorplan.setAsset(com.jeremy.exercise.moudle.Asset.objectTranslate(repository.getAsset()));
    return floorplan;
}
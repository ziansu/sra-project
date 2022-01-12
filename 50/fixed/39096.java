@java.lang.Override
public com.jeremy.exercise.moudle.Floorplan savaToRepository() {
    return com.jeremy.exercise.moudle.Floorplan.objectTranslate(com.jeremy.exercise.Repository.FloorplanRepository.save(this.toJson()));
}
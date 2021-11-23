@com.ccaroni.controller.RequestMapping(path = "/{id}", method = GET)
public com.ccaroni.domain.Race getRaceById(@com.ccaroni.controller.PathVariable(value = "id")
java.lang.String id) {
    validateRace(id);
    return raceRepository.findById(id).get();
}
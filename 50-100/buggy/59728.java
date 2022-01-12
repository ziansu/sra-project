@org.springframework.web.bind.annotation.CrossOrigin
@org.springframework.web.bind.annotation.RequestMapping(value = "/stop", method = org.springframework.web.bind.annotation.RequestMethod.GET, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
public org.springframework.http.ResponseEntity<ro.mpsit.web.ExerciseResults> stop(@org.springframework.web.bind.annotation.RequestParam
java.lang.String name) {
    if (!(smartwatchService.isPaired(name))) {
        return org.springframework.http.ResponseEntity.badRequest().body(null);
    }
    ro.mpsit.web.ExerciseResults exerciseResults = calorieCounterService.stopExercise(name);
    smartwatchService.stopExercise(name);
    return new org.springframework.http.ResponseEntity(exerciseResults, org.springframework.http.HttpStatus.OK);
}
@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, consumes = "application/json")
public org.springframework.http.ResponseEntity<com.app.model.StudijskiProgram> saveStudijskiProgram(@org.springframework.web.bind.annotation.RequestBody
com.app.model.StudijskiProgram studijskiProgram) {
    studijskiProgram = studijskiProgramService.save(studijskiProgram);
    return new org.springframework.http.ResponseEntity(studijskiProgram, org.springframework.http.HttpStatus.CREATED);
}
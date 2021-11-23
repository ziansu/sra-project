@lt.tieto.msi2016.missions.controllers.RequestMapping(value = "/api/missions/{id}", method = RequestMethod.POST)
public org.springframework.http.ResponseEntity<java.lang.Void> verifyOperator(@lt.tieto.msi2016.missions.controllers.PathVariable
java.lang.Long id, @lt.tieto.msi2016.missions.controllers.RequestParam(value = "operatorToken")
java.lang.String operatorToken, @lt.tieto.msi2016.missions.controllers.RequestBody
java.lang.String result) {
    if (operatorService.tokenExists(operatorToken)) {
        if (id.equals((-1))) {
            operatorService.verifyOperatorService(operatorToken);
        }else {
            missionService.changeOrderStatus("done", id);
        }
        missionService.saveResults(id, operatorToken, result);
        return org.springframework.http.ResponseEntity.status(HttpStatus.OK).build();
    }else {
        return org.springframework.http.ResponseEntity.status(HttpStatus.FORBIDDEN).build();
    }
}
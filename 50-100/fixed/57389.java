@org.springframework.web.bind.annotation.RequestMapping(value = "/deletedriver/{driverid}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
@org.springframework.web.bind.annotation.ResponseBody
public java.lang.Object deleteDriver(@org.springframework.web.bind.annotation.PathVariable(value = "driverid")
java.lang.Long driverId) {
    java.lang.Object response = driverService.deleteDriver(driverId);
    if (response instanceof com.dpu.model.Failed) {
        return new org.springframework.http.ResponseEntity<java.lang.Object>(response, org.springframework.http.HttpStatus.BAD_REQUEST);
    }else {
        return new org.springframework.http.ResponseEntity<java.lang.Object>(response, org.springframework.http.HttpStatus.OK);
    }
}
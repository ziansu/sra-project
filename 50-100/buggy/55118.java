@org.springframework.web.bind.annotation.RequestMapping(value = "/planeList")
public org.springframework.http.ResponseEntity<java.lang.Iterable<com.gl.planesAndAirfileds.domain.Plane>> getPlaneList() {
    planeDaoService.save();
    java.lang.Iterable<com.gl.planesAndAirfileds.domain.Plane> planes = planeDaoService.getAllPlanes();
    if (planes == null) {
        return new org.springframework.http.ResponseEntity<java.lang.Iterable<com.gl.planesAndAirfileds.domain.Plane>>(org.springframework.http.HttpStatus.INTERNAL_SERVER_ERROR);
    }else {
        return new org.springframework.http.ResponseEntity<java.lang.Iterable<com.gl.planesAndAirfileds.domain.Plane>>(planes, org.springframework.http.HttpStatus.OK);
    }
}
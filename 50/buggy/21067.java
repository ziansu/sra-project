@org.springframework.web.bind.annotation.RequestMapping(value = "/{name}")
public com.app.timezonediff.Timezone addTimezone(@org.springframework.web.bind.annotation.PathVariable
java.lang.String name, @org.springframework.web.bind.annotation.RequestBody
com.app.timezonediff.Timezone timezone) {
    if (timezone != null)
        com.app.timezonediff.DAOController.getTimeZoneDAO().insertTimezone(timezone);
    
    return new org.springframework.http.ResponseEntity<com.app.timezonediff.Timezone>(timezone, org.springframework.http.HttpStatus.OK);
}
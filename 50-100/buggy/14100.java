@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public com.app.timezonediff.TimezoneDiff getTimezoneDiff(@org.springframework.web.bind.annotation.PathVariable(value = "ref")
final java.lang.String ref, @org.springframework.web.bind.annotation.PathVariable(value = "target")
final java.lang.String target, @org.springframework.web.bind.annotation.RequestParam(value = "ref-mod", required = false, defaultValue = 0)
final int refModifier, @org.springframework.web.bind.annotation.RequestParam(value = "target-mod", required = false, defaultValue = 0)
final int targetModifier) throws com.app.timezonediff.BadParameterException {
    com.app.timezonediff.Timezone refTimezone = com.app.timezonediff.DefaultTimezoneDAO.getTimeZoneDAO().findByName(ref);
    if (refTimezone == null)
        throw new com.app.timezonediff.TimezoneNotFoundException(ref);
    
    com.app.timezonediff.Timezone targetTimezone = com.app.timezonediff.DefaultTimezoneDAO.getTimeZoneDAO().findByName(target);
    if (targetTimezone == null)
        throw new com.app.timezonediff.TimezoneNotFoundException(target);
    
    return new com.app.timezonediff.TimeZoneDiff(refTimezone, targetTimezone, refModifier, targetModifier);
}
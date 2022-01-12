@org.springframework.web.bind.annotation.RequestMapping(value = "/")
public com.app.timezonediff.TimezoneDiff getTimezoneDiff(@org.springframework.web.bind.annotation.PathVariable(value = "ref")
final java.lang.String ref, @org.springframework.web.bind.annotation.PathVariable(value = "target")
final java.lang.String target, @org.springframework.web.bind.annotation.RequestParam(value = "ref-mod", required = false, defaultValue = "0")
final java.lang.Integer refModifier, @org.springframework.web.bind.annotation.RequestParam(value = "target-mod", required = false, defaultValue = "0")
final java.lang.Integer targetModifier) {
    com.app.timezonediff.Timezone refTimezone = com.app.timezonediff.DefaultTimezoneDAO.getTimeZoneDAO().findByName(ref);
    com.app.timezonediff.Timezone targetTimezone = com.app.timezonediff.DefaultTimezoneDAO.getTimeZoneDAO().findByName(target);
    return new com.app.timezonediff.TimezoneDiff(refTimezone, targetTimezone, refModifier, targetModifier);
}
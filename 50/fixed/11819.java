@org.springframework.web.bind.annotation.GetMapping(value = "/{shareShortcut}")
public org.springframework.http.HttpEntity<pl.pvkk.profit.gpw.Share> findShare(@org.springframework.web.bind.annotation.PathVariable
java.lang.String shareShortcut) {
    return sharesService.findShareByShortcut(shareShortcut);
}
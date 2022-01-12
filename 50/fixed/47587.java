@de.escalon.hypermedia.action.Action(value = "ReviewAction")
@org.springframework.web.bind.annotation.RequestMapping(value = "/{rating}", params = "reviewBody", method = org.springframework.web.bind.annotation.RequestMethod.POST)
@org.springframework.web.bind.annotation.ResponseBody
public org.springframework.http.ResponseEntity<java.lang.Void> addReview(@org.springframework.web.bind.annotation.PathVariable
@de.escalon.hypermedia.action.Select(value = { "excellent" , "mediocre" , "abysmal" })
final java.lang.String rating, @org.springframework.web.bind.annotation.RequestParam(defaultValue = "excellent")
@de.escalon.hypermedia.action.Input(minLength = 5, pattern = "[ -~]*")
final java.lang.String reviewBody) {
    return null;
}
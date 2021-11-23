@java.lang.SuppressWarnings(value = "rawtypes")
@org.springframework.web.bind.annotation.RequestMapping(value = "/webhook", method = org.springframework.web.bind.annotation.RequestMethod.POST)
public org.springframework.http.HttpEntity receiveMessages(@org.springframework.web.bind.annotation.RequestBody
org.json.simple.JSONObject data) {
    if (data.get("object").equals("page")) {
    }
    return new org.springframework.http.ResponseEntity(org.springframework.http.HttpStatus.OK);
}
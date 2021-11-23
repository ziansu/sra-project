@org.springframework.web.bind.annotation.RequestMapping(value = "/gcm", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public void c2dmRegistration(@org.springframework.web.bind.annotation.RequestBody
final java.util.Map<java.lang.String, java.lang.String> data) {
    this.logAccessWithoutPdl("register", "gcm");
    saveEnvironmentProperties("Android", data);
    service.registerForGcm(data.get("c2dmRegistrationId"));
}
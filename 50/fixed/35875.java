@org.springframework.scheduling.annotation.Async
@org.springframework.web.bind.annotation.RequestMapping(value = "/get/{workerId}", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = "application/json")
@org.springframework.web.bind.annotation.ResponseBody
public hu.unideb.worktime.api.model.profile.ProfileRecord getProfile(@org.springframework.web.bind.annotation.PathVariable
java.lang.Integer workerId) {
    return this.sqlCallProfile.getProfileData(workerId);
}
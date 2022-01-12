@org.springframework.web.bind.annotation.RequestMapping(value = "/page/owner/save", headers = "Content-type=application/json", method = org.springframework.web.bind.annotation.RequestMethod.POST, produces = org.springframework.http.MediaType.APPLICATION_JSON_VALUE)
@org.springframework.web.bind.annotation.ResponseBody
public org.sofyan.latihan.app.ctrl.message.Message save(@org.springframework.web.bind.annotation.RequestBody
org.sofyan.latihan.app.model.Owner owner) {
    java.lang.String msg;
    if (((owner.getId()) == null) || (owner.getId().equals(0L)))
        msg = "Successfully save owner";
    else
        msg = "Successfully edit owner";
    
    this.ownerServiceImpl.save(owner);
    return org.sofyan.latihan.app.ctrl.message.Message.successMessage(msg);
}
@org.springframework.web.bind.annotation.PostMapping(value = "/device")
@org.springframework.web.bind.annotation.ResponseBody
public com.leaniot.domain.Device register(@org.springframework.web.bind.annotation.RequestBody
@javax.validation.Valid
com.leaniot.dto.DeviceInfo info, org.springframework.validation.BindingResult result) {
    if (result.hasErrors())
        throw new java.lang.RuntimeException(result.getFieldError().getDefaultMessage());
    
    info.setSites(null);
    return deviceService.register(info);
}
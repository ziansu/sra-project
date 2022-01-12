@org.springframework.web.bind.annotation.CrossOrigin
@org.springframework.web.bind.annotation.RequestMapping(value = "/sendEmail")
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public java.lang.String sendEmail(java.lang.String address) throws java.io.IOException {
    return sendEmail(address, address);
}
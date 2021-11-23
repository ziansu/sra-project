@org.springframework.web.bind.annotation.RequestMapping(value = "/sendEmail")
@org.springframework.web.bind.annotation.ResponseStatus(value = org.springframework.http.HttpStatus.OK)
public void sendEmail(java.lang.String address) throws java.io.IOException {
    sendEmail(address, address);
}
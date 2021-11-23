@org.springframework.web.bind.annotation.RequestMapping(value = "/gpio/init")
public org.springframework.http.ResponseEntity<nl.bos.entities.Pin> gpioInit() {
    gpio = nl.bos.controllers.GpioFactory.getInstance();
    return new org.springframework.http.ResponseEntity<nl.bos.entities.Pin>(pin, org.springframework.http.HttpStatus.OK);
}
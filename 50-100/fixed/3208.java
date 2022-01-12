@org.springframework.web.bind.annotation.RequestMapping(value = "/led/on")
public org.springframework.http.ResponseEntity<nl.bos.entities.Pin> ledOn() {
    final nl.bos.controllers.GpioPinDigitalOutput gpioPin = initGpioPin();
    if (gpioPin.isLow()) {
        gpioPin.high();
        log.info("LED IS ON");
        pin.setState(gpioPin.getState());
    }
    gpio.unprovisionPin(gpioPin);
    return new org.springframework.http.ResponseEntity(pin, org.springframework.http.HttpStatus.OK);
}
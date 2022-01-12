@org.springframework.web.bind.annotation.RequestMapping(value = "/led/blink")
public org.springframework.http.ResponseEntity<nl.bos.entities.Pin> ledBlink() {
    final nl.bos.controllers.GpioPinDigitalOutput gpioPin = initGpioPin();
    if (gpioPin.isLow()) {
        gpioPin.blink(1000);
        log.info("LED IS BLINKING");
        pin.setState(gpioPin.getState());
    }
    gpio.unprovisionPin(gpioPin);
    return new org.springframework.http.ResponseEntity(pin, org.springframework.http.HttpStatus.OK);
}
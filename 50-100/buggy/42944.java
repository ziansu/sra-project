@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.GET, value = "/startApplication")
public java.lang.String startQueueThread(@org.springframework.web.bind.annotation.RequestParam
java.lang.Integer masterCount1, @org.springframework.web.bind.annotation.RequestParam
java.lang.Integer masterCount2, @org.springframework.web.bind.annotation.RequestParam
java.lang.Integer masterCount3, @org.springframework.web.bind.annotation.RequestParam
java.lang.Integer masterCount4, @org.springframework.web.bind.annotation.RequestParam
java.lang.Integer minIntervalMinutes, @org.springframework.web.bind.annotation.RequestParam
java.lang.Integer maxIntervalMinutes, @org.springframework.web.bind.annotation.RequestParam
java.lang.Integer timeCoefficient) {
    systemStateService.startApplication(new java.lang.Integer[]{ masterCount1 , masterCount2 , masterCount3 , masterCount4 }, minIntervalMinutes, maxIntervalMinutes, timeCoefficient);
    return "";
}
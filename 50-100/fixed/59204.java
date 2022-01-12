@org.springframework.web.bind.annotation.PostMapping(value = "/createSignalDetection")
public com.deloitte.smt.entity.SignalDetection createSignalDetection(@org.springframework.web.bind.annotation.RequestParam(value = "data")
java.lang.String topicString) {
    com.deloitte.smt.entity.SignalDetection signalDetection = null;
    try {
        signalDetection = new com.fasterxml.jackson.databind.ObjectMapper().readValue(topicString, com.deloitte.smt.entity.SignalDetection.class);
        return signalDetectionService.createOrUpdateSignalDetection(signalDetection);
    } catch (com.deloitte.smt.exception.ApplicationException | java.io.IOException e) {
        com.deloitte.smt.controller.SignalDetectionController.LOG.error(("Exception occured while creating " + e));
    }
    return signalDetection;
}
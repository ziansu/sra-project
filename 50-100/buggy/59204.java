@org.springframework.web.bind.annotation.PostMapping(value = "/createSignalDetection")
public com.deloitte.smt.entity.SignalDetection createSignalDetection(@org.springframework.web.bind.annotation.RequestParam(value = "data")
java.lang.String topicString) throws java.lang.Exception {
    try {
        com.deloitte.smt.entity.SignalDetection signalDetection = new com.fasterxml.jackson.databind.ObjectMapper().readValue(topicString, com.deloitte.smt.entity.SignalDetection.class);
        return signalDetectionService.createOrUpdateSignalDetection(signalDetection);
    } catch (com.deloitte.smt.exception.ApplicationException | java.io.IOException e) {
        com.deloitte.smt.controller.SignalDetectionController.LOG.info(("Exception occured while creating " + e));
        throw e;
    }
}
@org.springframework.web.bind.annotation.RequestMapping(value = "/3d/{id}", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.lang.Object getPrediction3D(@org.springframework.web.bind.annotation.PathVariable(value = "id")
java.lang.Long id) {
    org.oracul.service.dto.Prediction3D prediction = prediction3dRepository.findById(id);
    if ((prediction != null) && ((prediction.getLevels()) != null)) {
        return prediction;
    }else {
        return statusHolder.checkStatus(id);
    }
}
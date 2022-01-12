@org.springframework.web.bind.annotation.RequestMapping(value = "/setMode")
public void setNewMode(@org.springframework.web.bind.annotation.RequestParam
java.lang.String displayElementType, @org.springframework.web.bind.annotation.RequestParam
java.lang.String requestType, @org.springframework.web.bind.annotation.RequestParam(required = false)
java.lang.String groupedBy) {
    io.mlh.controllers.AlexaController.logger.error("Called alexa setMode!");
    io.mlh.controllers.AlexaController.logger.error(("display element type " + displayElementType));
    io.mlh.controllers.AlexaController.logger.error(("request type" + requestType));
    java.util.List lAcc = coService.getAllAccounts();
    ssService.setDisplayData(lAcc);
    ssService.setDisplayMetadata(new io.mlh.objects.Metadata(new io.mlh.objects.charts.PieChartDisplayElementConfig(groupedBy), true, lAcc.size(), io.mlh.types.DataSetType.valueOf(requestType)));
}
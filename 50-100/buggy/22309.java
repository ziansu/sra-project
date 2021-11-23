@org.springframework.web.bind.annotation.RequestMapping(method = org.springframework.web.bind.annotation.RequestMethod.POST, value = "addDataObjects")
@org.springframework.web.bind.annotation.ResponseBody
public int addDataObjects(@org.springframework.web.bind.annotation.RequestBody(required = true)
rocks.inspectit.server.service.rest.dotnetdata.DotNetMethodSensorData[] dataObjects) {
    java.lang.System.out.println((("Data recieved. Size is " + (dataObjects.length)) + "."));
    java.util.List<rocks.inspectit.shared.all.communication.DefaultData> defaultDataList = new java.util.ArrayList<>();
    for (rocks.inspectit.server.service.rest.dotnetdata.DotNetMethodSensorData data : dataObjects) {
        java.lang.System.out.println(data);
        defaultDataList.add(data.toDefaultData());
    }
    agentStorageService.addDataObjects(defaultDataList);
    return 1;
}
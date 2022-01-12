@example.api.ApiMethod(description = "add color item")
@example.api.RequestMapping(value = "/color/{color}", method = RequestMethod.PUT)
public void addColorByPath(@example.api.ApiPathParam(name = "color", description = "color")
@example.api.PathVariable
example.api.RestServer.Color color) {
    colorTable.put(color.name, ("#" + (color.code)));
}
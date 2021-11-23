@org.springframework.web.bind.annotation.RequestMapping(value = "/statements")
@jena.ResponseBody
public jena.JenaStatement statement(@jena.PathVariable(value = "id")
long id) {
    return statementArrayList.get(id);
}
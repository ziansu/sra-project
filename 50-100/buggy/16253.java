public int id() {
    cn.edu.fudan.request.AddTableRequest.Table table = table();
    cn.edu.fudan.request.AddTableRequest.Field field = table.fields[table.idCol];
    for (cn.edu.fudan.request.AddTableRequest.Add add : adds) {
        if (field.name.equals(add.field)) {
            return ((java.lang.Integer) (Parser.IntParser.parse(add.value)));
        }
    }
    return -1;
}
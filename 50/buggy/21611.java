public com.example.godsi.myapplication.Attribute getParameter(int id) {
    int index = parametersArray.indexOf(new com.example.godsi.myapplication.Attribute(id));
    return parametersArray.get(index);
}
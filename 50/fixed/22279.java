public com.example.godsi.myapplication.Attribute getParameter(int id) {
    int index = parametersArray.indexOf(new com.example.godsi.myapplication.Attribute(id));
    if (index >= 0) {
        return parametersArray.get(index);
    }
    return null;
}
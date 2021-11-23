public java.util.ArrayList<java.lang.String> getSpecificAlias(int index) {
    java.lang.String[] argument = alias_.get(index).split(",");
    java.util.ArrayList<java.lang.String> output = new java.util.ArrayList<>();
    for (int i = 0; i < (argument.length); i++) {
        output.add(argument[i]);
    }
    return output;
}
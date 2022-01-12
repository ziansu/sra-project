public void addFunctionDimension() {
    java.util.ArrayList<com.example.jonny.myfirstapp.Variable> globals = varRunTree.get(0).variables;
    varRunTree.add(new com.example.jonny.myfirstapp.VarTree(null));
    varRunTree.get(((varRunTree.size()) - 1)).variables = globals;
}
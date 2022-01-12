public void setArrayFromValueString() {
    java.lang.String[] tokens = value.split(Structures.View.ID_SEPARATOR);
    idArray = new java.util.ArrayList<java.lang.Integer>();
    for (int i = 0; i < (tokens.length); i++)
        if (!(idArray.contains(java.lang.Integer.parseInt(tokens[i]))))
            idArray.add(java.lang.Integer.parseInt(tokens[i]));
        
    
}
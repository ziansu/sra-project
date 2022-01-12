private boolean ApplesDone() {
    for (int i = 0; i < (java.lang.Integer.parseInt(numberOfTrees.getSelectedItem().toString())); i++)
        if (numberOfApplesOnTree[i].getText().isEmpty())
            return false;
        
    
    return true;
}
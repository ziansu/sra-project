private boolean ApplesDone() {
    boolean numberOfApplesSelected = false;
    for (int i = 0; i < (java.lang.Integer.parseInt(numberOfTrees.getSelectedItem().toString())); i++)
        if (numberOfApplesOnTree[i].getText().isEmpty()) {
            numberOfApplesSelected = false;
            break;
        }else
            numberOfApplesSelected = true;
        
    
    return numberOfApplesSelected;
}
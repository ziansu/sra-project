@java.lang.Override
protected void keyTyped(char c, int i) {
    if (textField.textboxKeyTyped(c, i)) {
        updateRecipes(true);
    }else
        super.keyTyped(c, i);
    
}
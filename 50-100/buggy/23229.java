public boolean guess(java.util.ArrayList<java.lang.Integer> alActionContent) {
    this.alGuess = alActionContent;
    if ((alActionContent.size()) != (alMapping.size())) {
        java.lang.System.out.println("Wrong guess size!");
        return false;
    }
    for (int i = 0; i < (alActionContent.size()); i++) {
        if ((alActionContent.get(i)) != (alMapping.get(i))) {
            return false;
        }
    }
    return true;
}
public void runSymbole() {
    this.lecteur.wStack.push(this.lecteur.sourceCodePtr);
    this.lecteur.wStack.push(((this.lecteur.pointeur.getValue()) - 1));
}
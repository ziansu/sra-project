@java.lang.Override
public void creerLesMouvements() {
    toucan.modele.IAnimation comparaisonCaseCase = new toucan.modele.ComparaisonCaseCase();
    toucan.modele.IAnimation comparaisonVariableCase = new toucan.modele.ComparaisonVariableCase();
    toucan.modele.IAnimation affectationCaseCase = new toucan.modele.AffectationCaseCase();
    toucan.modele.IAnimation affectationVariableCase = new toucan.modele.AffectationVariableCase();
    toucan.modele.IAnimation affectationCaseVariable = new toucan.modele.AffectationCaseVariable();
    affectationCaseVariable.executer(this.lesCases, 3);
    setChanged();
    notifyObservers();
}
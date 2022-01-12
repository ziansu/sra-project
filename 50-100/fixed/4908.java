public void removeCogniton(civilisation.individu.cognitons.TypeCogniton cognitonToRemove) {
    java.lang.System.out.println("remove cogniton");
    for (java.util.Iterator<civilisation.inspecteur.simulation.GCogniton> it = gCognitons.iterator(); it.hasNext();) {
        civilisation.inspecteur.simulation.GCogniton cog = it.next();
        if ((cog.getCogniton()) == cognitonToRemove) {
            this.remove(cog);
            it.remove();
            allCognitons.remove(cog.getCogniton());
        }
    }
}
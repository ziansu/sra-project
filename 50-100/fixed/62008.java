phylo.Tree tournamentSelection(int numberOfCandidate) {
    java.util.Random rnd = new java.util.Random();
    phylo.Tree t = pop.get(rnd.nextInt(pop.size()));
    for (int i = 0; i < numberOfCandidate; i++) {
        phylo.Tree temp = pop.get(rnd.nextInt(pop.size()));
        if ((temp.root.score) < (t.root.score))
            t = temp;
        
    }
    return t;
}
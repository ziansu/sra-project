public void findBest() {
    main.arc.domain.Edge[] link = new main.arc.domain.Edge[edges(bestTree.getVertexMax())];
    main.java.parnatalOnline.src.Network tree = new main.java.parnatalOnline.src.Network(bestTree.getVertexMax(), bestTree.getDegreeMax());
    main.java.parnatalOnline.src.Chronometer.start();
    initializeLinkVector(link, tree);
    combinations(link, ((bestTree.getVertexMax()) - 1), 0, tree);
    main.java.parnatalOnline.src.Chronometer.stop();
    executionTime = main.java.parnatalOnline.src.Chronometer.elapsedTime();
}
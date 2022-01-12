private void breakPathwayComponentCycle(final cpath.service.Pathway rootPathway, final cpath.service.Pathway currentPathway) {
    if (currentPathway.getPathwayComponent().contains(rootPathway)) {
        currentPathway.removePathwayComponent(rootPathway);
    }
    if (currentPathway.getPathwayComponent().contains(currentPathway)) {
        currentPathway.removePathwayComponent(currentPathway);
    }
    for (java.lang.Process proc : currentPathway.getPathwayComponent())
        if (proc instanceof cpath.service.Pathway)
            breakPathwayComponentCycle(rootPathway, ((cpath.service.Pathway) (proc)));
        
    
}
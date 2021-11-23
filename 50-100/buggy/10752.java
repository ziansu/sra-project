public java.util.Set<sk.fei.stuba.xpivarcim.db.entities.assignment.TestFile> unitTestFiles() {
    java.util.Set<sk.fei.stuba.xpivarcim.db.entities.assignment.TestFile> output = new java.util.HashSet<>();
    for (sk.fei.stuba.xpivarcim.db.entities.assignment.TestFile f : testFiles)
        if (!(f.isRunTest()))
            output.add(f);
        
    
    return output;
}
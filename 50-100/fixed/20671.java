public boolean existsIn(PolicyHolder inHolder) {
    fileOfPolicies = new TextFile(filename, PolicyFile.READ_MODE);
    boolean matchFound = false;
    if (fileOfPolicies.openFile()) {
        while ((!(fileOfPolicies.endOfFile())) && (!matchFound)) {
            java.lang.System.out.println(readLine());
        } 
    }
    fileOfPolicies.closeFile();
    fileOfPolicies = null;
    return matchFound;
}
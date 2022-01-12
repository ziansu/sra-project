public boolean signUpForTask(int indexOfTask, java.lang.String name) {
    if ((indexOfTask > (tasks.size())) || (isSignedUpFor(indexOfTask)))
        return false;
    
    tasks.get(indexOfTask).add(name);
    return true;
}
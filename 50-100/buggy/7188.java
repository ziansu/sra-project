public java.util.ArrayList<java.lang.String> getModulePoolPaths() {
    java.util.ArrayList<java.lang.String> output = new java.util.ArrayList<java.lang.String>();
    if ((listofPredecessors.size()) == 0) {
        return this.getCurrentFilePath();
    }else {
        for (Runner.ModulePool mp : listofPredecessors) {
            output.addAll(mp.getCurrentFilePath());
        }
    }
    return output;
}
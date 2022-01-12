public cs361Project.Run getRun(int runNumber) {
    if ((runNumber < 0) || (runNumber >= (runList.size()))) {
        java.lang.System.out.println("Invalid run number!");
        return null;
    }else
        return this.getRunList().get(runNumber);
    
}
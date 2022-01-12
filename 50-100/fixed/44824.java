public static void main(java.lang.String[] args) {
    java.lang.String wfPath = ".\\resources\\tplgs\\tplg1.json";
    java.lang.String envPath = ".\\resources\\envs\\env1.json";
    java.lang.String seedSolution = ".\\resources\\solutions\\sol1.json";
    int localNet = 5000;
    int globNet = 5;
    itmo.escience.simenv.StormScheduler storm = new itmo.escience.simenv.StormScheduler(wfPath, envPath, globNet, localNet, null);
    storm.initialization();
    java.util.HashMap<java.lang.String, java.util.ArrayList<java.util.ArrayList<java.lang.Object>>> result = storm.scheduleToMapList(storm.run());
    java.lang.System.out.println("Finished");
}
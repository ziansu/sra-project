public static void main(java.lang.String[] args) {
    java.lang.String instanceDir = "C:\\Users\\yuhuishi\\Desktop\\projects\\TP3S_column_generation\\instance\\small";
    java.lang.String outDir = "./logs/facility/small/";
    instanceDir = "C:\\Users\\yuhuishi\\Desktop\\projects\\TP3S_column_generation\\instance\\moderate";
    outDir = "./logs/facility/moderate/";
    runner.RunNoFacilityVersion.run(instanceDir, outDir, true);
    outDir = "./logs/moderate/";
    runner.RunNoFacilityVersion.run(instanceDir, outDir, false);
    instanceDir = "C:\\Users\\yuhuishi\\Desktop\\projects\\TP3S_column_generation\\instance\\large";
    outDir = "./logs/facility/large/";
    runner.RunNoFacilityVersion.run(instanceDir, outDir, true);
    outDir = "./logs/large/";
    runner.RunNoFacilityVersion.run(instanceDir, outDir, false);
}
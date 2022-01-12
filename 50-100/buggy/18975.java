@java.lang.Override
public com.alphatica.genotick.population.RobotName[] listRobotNames() {
    java.lang.String[] files = listFiles(robotsPath);
    com.alphatica.genotick.population.RobotName[] names = new com.alphatica.genotick.population.RobotName[files.length];
    for (int i = 0; i < (files.length); i++) {
        java.lang.String longString = files[i].substring(0, files[i].indexOf('.'));
        names[i] = new com.alphatica.genotick.population.RobotName(java.lang.Long.valueOf(longString));
    }
    return names;
}
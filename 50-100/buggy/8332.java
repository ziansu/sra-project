public void addDeadDenLocation(viperinos.MapLocation den) {
    viperinos.MapLocation[] temp = new viperinos.MapLocation[(deadDens.length) + 1];
    java.lang.System.arraycopy(deadDens, 0, temp, 0, deadDens.length);
    temp[((deadDens.length) + 1)] = den;
    deadDens = temp;
}
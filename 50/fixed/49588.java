public float getCpuUsed() {
    return (cpuUsed) != null ? java.lang.Float.parseFloat(cpuUsed.substring(0, ((cpuUsed.length()) - 1))) : 0.0F;
}
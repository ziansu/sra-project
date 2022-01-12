private boolean isActive() {
    return (Build.HARDWARE.equals("goldfish")) || (Build.HARDWARE.equals("ranchu"));
}
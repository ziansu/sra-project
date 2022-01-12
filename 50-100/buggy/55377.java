public void autoshift(double leftThrottle, double rightThrottle, double leftVel, double rightVel, java.util.function.Consumer<java.lang.Integer> shift) {
    if (shouldDownshift(leftThrottle, rightThrottle, leftVel, rightVel)) {
        shift.accept(Shiftable.gear.LOW.getNumVal());
        java.lang.System.out.println("Downshifted");
    }else
        if (shouldUpshift(leftThrottle, rightThrottle, leftVel, rightVel)) {
            shift.accept(Shiftable.gear.HIGH.getNumVal());
            java.lang.System.out.println("Upshifted");
        }
    
}
private dat367.falling.math.Vector calculateAcceleration(dat367.falling.core.Jumper jumper) {
    java.lang.System.out.println("calculateAcceleration");
    return calcAccY(jumper).add(calcAccXZ(jumper));
}
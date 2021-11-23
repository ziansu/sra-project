private dat367.falling.math.Vector calculateAcceleration(dat367.falling.core.Jumper jumper) {
    return calcAccY(jumper).add(calcAccXZ(jumper));
}
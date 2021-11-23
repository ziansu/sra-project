public static void climbSafetyTogglePrimary(boolean climbSafetyButton1) {
    if (climbSafetyButton1 && (com.github.adambots.steamworks2017.climb.Climb.climbSafetyPrimaryReleased)) {
        (com.github.adambots.steamworks2017.climb.Climb.counterPrimary)++;
        com.github.adambots.steamworks2017.climb.Climb.climbSafetyPrimaryReleased = false;
    }else {
        com.github.adambots.steamworks2017.climb.Climb.climbSafetyPrimaryReleased = true;
    }
    if ((com.github.adambots.steamworks2017.climb.Climb.counterPrimary) == (org.usfirst.frc.team245.robot.Constants.COUNTER_END)) {
        com.github.adambots.steamworks2017.climb.Climb.counterPrimary = org.usfirst.frc.team245.robot.Constants.COUNTER_START;
        com.github.adambots.steamworks2017.climb.Climb.climbSafetyPrimary = !(com.github.adambots.steamworks2017.climb.Climb.climbSafetyPrimary);
    }
}
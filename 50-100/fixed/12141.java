private java.lang.String giveRelevantError() {
    switch (this.wantedVariable) {
        case "Angular Velocity" :
            return "To calculate Angular Velocity, you need either of these sets of measurements: Angle and Time <p>Linear Velocity and Radius <p>Arc Length, Angle, and Linear Velocity <p>Time, Radius, and Arc Length</p></p></p></p>";
        case "Linear Velocity" :
            return "To calculate Linear Velocity, you need either of these sets of measurements: <p>Arc Length and Time <p>Angular Velocity and Radius <p>Arc Length, Angle, and Angular Velocity <p>Time, Radius, and Angle</p></p></p></p>";
        case "Radius" :
            return "To calculate Radius, you need either of these sets of measurements: <p>Linear Velocity and Angular Velocity <p>Arc Length and Angle <p>Arc Length, Time, and Angular Velocity <p>Time, Angle, and Linear Velocity</p></p></p></p>";
        case "Time" :
            return "To calculate Time, you need either of these sets of measurements: <p>Angular Velocity and Angle <p>Linear Velocity and Arc Length <p>Radius, Angle, and Linear Velocity <p>Angular Velocity, Radius, and Arc Length</p></p></p></p>";
        case "Arc Length" :
            return "To calculate Arc Length you need either of these sets of measurements: <p>Time and Linear Velocity <p>Angle and Radius <p>Radius, Time, and Angular Velocity <p>Angular Velocity, Angle, and Angular Velocity</p></p></p></p>";
        case "Angle" :
            return "To calculate Angle, you need either of these sets of measurements: <p>Angular Velocity and Time <p>Radius and Arc Length <p>Arc Length, Angular Velocity, and Linear Velocity <p>Time, Radius, and Linear Velocity</p></p></p></p>";
    }
    return "";
}
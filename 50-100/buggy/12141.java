private java.lang.String giveRelevantError() {
    java.lang.String error = "";
    java.lang.System.out.println(this.wantedVariable);
    switch (this.wantedVariable) {
        case "Angular Velocity" :
            error = "To calculate Angular Velocity, you need either of these sets of measurements: Angle and Time <p>Linear Velocity and Radius <p>Arc Length, Angle, and Linear Velocity <p>Time, Radius, and Arc Length</p></p></p></p>";
        case "Linear Velocity" :
            error = "To calculate Linear Velocity, you need either of these sets of measurements: <p>Arc Length and Time <p>Angular Velocity and Radius <p>Arc Length, Angle, and Angular Velocity <p>Time, Radius, and Angle</p></p></p></p>";
        case "Radius" :
            error = "To calculate Radius, you need either of these sets of measurements: <p>Linear Velocity and Angular Velocity <p>Arc Length and Angle <p>Arc Length, Time, and Angular Velocity <p>Time, Angle, and Linear Velocity</p></p></p></p>";
        case "Time" :
            error = "To calculate Time, you need either of these sets of measurements: <p>Angular Velocity and Angle <p>Linear Velocity and Arc Length <p>Radius, Angle, and Linear Velocity <p>Angular Velocity, Radius, and Arc Length</p></p></p></p>";
        case "Arc Length" :
            error = "To calculate Arc Length you need either of these sets of measurements: <p>Time and Linear Velocity <p>Angle and Radius <p>Radius, Time, and Angular Velocity <p>Angular Velocity, Angle, and Angular Velocity</p></p></p></p>";
        case "Angle" :
            error = "To calculate Angle, you need either of these sets of measurements: <p>Angular Velocity and Time <p>Radius and Arc Length <p>Arc Length, Angular Velocity, and Linear Velocity <p>Time, Radius, and Linear Velocity</p></p></p></p>";
    }
    switch (this.wantedVariable) {
        case "Angular Velocity" :
            java.lang.System.out.println("This is working right");
            break;
        case "Angle" :
            java.lang.System.out.println("Its not going to the right one");
    }
    return error;
}
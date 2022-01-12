public static void main(java.lang.String[] args) {
    lejos.robotics.subsumption.Behavior b1 = new MoveForward();
    lejos.robotics.subsumption.Behavior b2 = new SenseUltrasonic();
    lejos.robotics.subsumption.Behavior b3 = new SenseLight();
    lejos.robotics.subsumption.Behavior[] bArray = new lejos.robotics.subsumption.Behavior[]{ b3 , b2 , b1 };
    lejos.robotics.subsumption.Arbitrator arby = new lejos.robotics.subsumption.Arbitrator(bArray);
    arby.start();
}
public static void main(java.lang.String[] args) {
    production.SimRandom rand = new production.SimRandom();
    production.Floor F = new production.MockFloor(rand);
    production.RobotScheduler R = new production.RobotScheduler(F);
    production.OrderControl O = new production.OrderControl();
    production.Belt B = new production.Belt(F);
    production.Inventory I = new production.Inventory(F, new production.SimRandom());
    production.Master m = new production.Master(F, R, I, O, B);
    m.run(30);
}
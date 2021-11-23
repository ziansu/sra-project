public void run() {
    instruments = new org.firstinspires.ftc.teamcode.organs.Instruments();
    instruments.start();
    bp = new org.firstinspires.ftc.teamcode.controllers.teleop.ButtonPusher(new org.firstinspires.ftc.teamcode.organs.Pusher());
    org.firstinspires.ftc.teamcode.tissues.TCamera camera = new org.firstinspires.ftc.teamcode.tissues.TCamera();
    neuronTest = new org.firstinspires.ftc.teamcode.controllers.tests.NeuronTest(instruments, camera);
}
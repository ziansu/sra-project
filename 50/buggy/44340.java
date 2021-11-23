public static int getTimeLeftInSec() {
    return controllers.Global.nextExecutionInSeconds(controllers.TimerController.getTimeLeftHour(), controllers.TimerController.getTimeLeftMinute());
}
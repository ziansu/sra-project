public static void pushRobot(objects.DTORobot robot) {
    if (image.ResultHandler.mapSet) {
        try {
            image.ResultHandler.routingController.updateRobot(robot);
        } catch (algorithm.IRoutingController.NoBallsException e) {
            java.lang.System.err.println("ResultHandler got exception when calling RoutingController: No balls!");
        } catch (algorithm.IRoutingController.NoGoalException e) {
            java.lang.System.err.println("ResultHandler got exception when calling RoutingController: No goals!");
        } catch (algorithm.IRoutingController.NoMapException e) {
            java.lang.System.err.println("ResultHandler got exception when calling RoutingController: No map!");
        }
    }else {
        java.lang.System.err.println("ResultHandler> Trying to push robot, but no map set.");
    }
}
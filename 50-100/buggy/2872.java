public void validateState(Program.Core.Robot robot) throws java.io.IOException {
    Program.Skeleton.SkeletonUtility.printCall("ValidateState", this);
    robot.getPosition();
    if (Program.Skeleton.SkeletonUtility.yesOrNoQuestion("Kiest�l a p�ly�r�l?")) {
        robot.die();
    }
    if (Program.Skeleton.SkeletonUtility.yesOrNoQuestion("Belel�pett a robot egy ragacsba?")) {
        dummyRagacsForSkeleton.stepIn(robot);
    }
    if (Program.Skeleton.SkeletonUtility.yesOrNoQuestion("Belel�pett a robot egy olajba?")) {
        dummyOlajForSkeleton.stepIn(robot);
    }
    Program.Skeleton.SkeletonUtility.printReturn("ValidateState", this);
}
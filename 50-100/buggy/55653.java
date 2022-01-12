public void startGame() {
    elapsedTime = 0;
    Program.Skeleton.SkeletonUtility.printCall("StartGame", this);
    for (Program.Core.PlayerRobot r : GameMap.getRobots()) {
        r.modifySpeed(new Program.Helpers.Vector(0, 0));
    }
    Program.Skeleton.SkeletonUtility.printReturn("StartGame", this);
}
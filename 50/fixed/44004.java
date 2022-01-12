private void overrideTrajectory(int jointIdx) {
    jointTrajectoryGenerators.get(jointIdx).clear();
    pointQueues.get(jointIdx).clear();
}
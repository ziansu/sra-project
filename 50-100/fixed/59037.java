private void calculateRotations(int[] unrotated) {
    rotated = new int[4][];
    rotated[2] = unrotated;
    rotated[1] = net.teamio.taam.conveyors.ConveyorUtil.rotate(unrotated);
    rotated[0] = net.teamio.taam.conveyors.ConveyorUtil.rotate(rotated[1]);
    rotated[3] = net.teamio.taam.conveyors.ConveyorUtil.rotate(rotated[0]);
}
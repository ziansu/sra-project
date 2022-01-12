public void move(float[] inputs) {
    drone.getCommandManager().move(inputs[0], inputs[1], inputs[2], inputs[3]);
}
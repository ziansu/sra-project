protected void rotateBarrel(com.sidescroller.game.Direction direction) {
    if (direction == (com.sidescroller.game.Direction.RIGHT)) {
        barrelJoint.setMotorSpeed(java.lang.Math.abs(motorSpeed));
    }else
        if (direction == (com.sidescroller.game.Direction.LEFT)) {
            barrelJoint.setMotorSpeed((-(java.lang.Math.abs(motorSpeed))));
        }else {
            barrelJoint.setMotorSpeed(0);
        }
    
}
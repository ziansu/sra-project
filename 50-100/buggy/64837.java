public void fire(int angle) {
    this.setAngle(angle);
    this.setState(nl.tudelft.bust_a_move20162017.bust_a_move_framework.bubble.Bubble.State.FIRING);
    this.setXSpeed(((java.lang.Math.cos(java.lang.Math.toRadians((angle + 90)))) * (nl.tudelft.bust_a_move20162017.bust_a_move_framework.bubble.Bubble.SPEED)));
    this.setYSpeed(((-(java.lang.Math.sin(java.lang.Math.toRadians((angle + 90))))) * (nl.tudelft.bust_a_move20162017.bust_a_move_framework.bubble.Bubble.SPEED)));
}
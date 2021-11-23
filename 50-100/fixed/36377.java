public boolean intersectsCircle(com.critters.breakout.math.Circle c) {
    return (((top.intersectsCircle(c)) || (bottom.intersectsCircle(c))) || (left.intersectsCircle(c))) || (right.intersectsCircle(c));
}
@java.lang.Override
public org.deepercreeper.engine.util.Vector computeAcceleration() {
    org.deepercreeper.engine.util.Vector distance = position.minus(getBox().getCenter());
    return distance.times((((getMass()) * 2000) / (((distance.norm()) * (distance.norm())) * (distance.norm()))));
}
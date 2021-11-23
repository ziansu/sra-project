public float getTowerToEnemyAngle(bachelor.project.nije214.thhym14.Enemy e, bachelor.project.nije214.thhym14.Tower t) {
    return ((float) (java.lang.Math.atan2(((e.getY()) - (t.getY())), ((e.getX()) - (t.getX())))));
}
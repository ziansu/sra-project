public void setLoiterRadius(double radius) {
    reference.radius = ((float) (radius));
    if (radius != 0)
        reference.flags.add(FLAGS.FLAG_RADIUS);
    else
        reference.flags.remove(FLAGS.FLAG_RADIUS);
    
}
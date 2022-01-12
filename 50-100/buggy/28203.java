private void handleRadius(float delta) {
    if (((time) > 2) && ((bounds.radius) < (fullRadius)))
        bounds.radius += 0.5;
    else
        if ((time) < 2) {
            bounds.radius -= (bounds.radius) * delta;
            java.lang.System.out.println(("time: " + (time)));
            java.lang.System.out.println(("radius: " + (bounds.radius)));
        }
    
}
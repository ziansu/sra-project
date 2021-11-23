void render(float delta, float dis1, float dis2) {
    if (((dist) - dis1) < (FOS)) {
        lane_1.render(delta, (((dist) - dis1) / (FOS)));
    }
    if (((dist) - dis2) < (FOS)) {
        lane_2.render(delta, (((dist) - dis2) / (FOS)));
    }
}
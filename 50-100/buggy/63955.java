void render(float delta, float dis1, float dis2) {
    if (((dist) - dis1) < 50) {
        lane_1.render(delta, (((dist) - dis1) / (FOS)));
    }
    if (((dist) - dis2) < 50) {
        lane_2.render(delta, (((dist) - dis2) / (FOS)));
    }
}
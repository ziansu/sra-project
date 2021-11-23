public void render() {
    main.fill(255, 0, 0);
    main.stroke(255, 0, 0);
    main.rect(pos.x, pos.y, bWidth, bWidth);
    (time)++;
    detect();
}
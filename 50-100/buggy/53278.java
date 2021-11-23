public void render() {
    personalDegreeOffset = 180;
    pangeo.main.Main.draw(tex, (640 + ((int) (java.lang.Math.floor((((pos.X) - (Main.player.pos.X)) * 16))))), (380 + ((int) (java.lang.Math.floor((((pos.Y) - (Main.player.pos.Y)) * 16))))), fireworkColor, (((personalDegreeOffset) + (degreeOffset)) + (360 - (rotation))));
}
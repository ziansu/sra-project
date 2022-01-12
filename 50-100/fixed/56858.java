public static void playerPosition() {
    example.Player.gravity += 1.0E-5F;
    example.Player.x1poly += example.Player.xSpeed;
    example.Player.x2poly += example.Player.xSpeed;
    example.Player.x3poly += example.Player.xSpeed;
    example.Player.y1poly += (example.Player.ySpeed) + (example.Player.gravity);
    example.Player.y2poly += (example.Player.ySpeed) + (example.Player.gravity);
    example.Player.y3poly += (example.Player.ySpeed) + (example.Player.gravity);
    example.Player.yCond = ((example.Player.ySpeed) + (example.Player.gravity)) * 100;
}
public static void playerPosition() {
    example.Player.gravity += 1.0E-5F;
    example.Player.xSpeed = example.Player.xThrust;
    example.Player.ySpeed = (example.Player.yThrust) + (example.Player.gravity);
    example.Player.x1poly += example.Player.xSpeed;
    example.Player.x2poly += example.Player.xSpeed;
    example.Player.x3poly += example.Player.xSpeed;
    example.Player.y1poly += example.Player.ySpeed;
    example.Player.y2poly += example.Player.ySpeed;
    example.Player.y3poly += example.Player.ySpeed;
    example.Player.yCond = ((example.Player.ySpeed) + (example.Player.gravity)) * 100;
}
public static com.springer.challenge.graphics.Canvas create(int width, int height) throws com.springer.challenge.commands.InvalidParameter {
    if ((width <= 0) || (height < 0))
        throw new com.springer.challenge.commands.InvalidParameter("Invalid width and height parameters.");
    
    com.springer.challenge.graphics.Canvas canvas = new com.springer.challenge.graphics.Canvas();
    canvas.screen = new char[width][height];
    com.springer.challenge.graphics.Canvas.canvas = canvas;
    return canvas;
}
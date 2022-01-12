private void startLineStroke(int x, int y, int button) {
    line.startX = x;
    line.startY = y;
    line.stroke = new draw.commands.Stroke(Tool.Line, getDrawColorForMouseButton(button));
    line.stroke.addLine(image, x, y, x, y);
    state = draw.DrawAreaController.State.DrawingLine;
}
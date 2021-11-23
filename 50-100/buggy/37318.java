@java.lang.Override
public void update(tw.edu.ncu.softwareengineering.dodoio.CollideObject.Position position) {
    int XOffset = (position.getX()) - (this.position.getX());
    int YOffset = -((position.getY()) - (this.position.getY()));
    for (tw.edu.ncu.softwareengineering.dodoio.Collide.Point point : points) {
        point.x += XOffset;
        point.y += YOffset;
    }
    this.position.setPosition(position.getX(), position.getY(), position.getDirection());
}
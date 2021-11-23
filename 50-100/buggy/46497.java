private void init(int r, java.awt.Point c) {
    if (r >= 0)
        this.radius = r;
    else
        this.radius = 1;
    
    setPosition(((int) (c.getX())), ((int) (c.getY())));
    this.center = c;
    setRes(70);
    this.componentName = "circle_" + (components._2d.CadCircle.componentNumber);
    (components._2d.CadCircle.componentNumber)++;
}
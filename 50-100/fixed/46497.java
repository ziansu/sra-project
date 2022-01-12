private void init(int r, java.awt.Point c) {
    if (r < 0)
        this.radius = java.lang.Math.abs(r);
    else
        this.radius = r;
    
    setPosition(((int) (c.getX())), ((int) (c.getY())));
    this.center = c;
    setRes(70);
    this.componentName = "circle_" + (components._2d.CadCircle.componentNumber);
    (components._2d.CadCircle.componentNumber)++;
}
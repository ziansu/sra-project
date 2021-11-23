public java.lang.Boolean isCheckPointChecked(Program.Core.Robot robot, Program.Helpers.FloatPoint beforejump) {
    Program.Helpers.Line ugras = new Program.Helpers.Line(robot.position.getX(), beforejump.getX(), robot.position.getY(), beforejump.getY());
    java.lang.Boolean metsz = false;
    for (Program.Helpers.Line i : checkPoints) {
        if (i.intersect(ugras))
            metsz = true;
        
    }
    return metsz;
}
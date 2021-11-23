public java.awt.Point getXandY() {
    java.lang.System.out.println("What x coordinate?");
    x = playerInput.HumanInput.replaceLaterScanner.nextInt();
    java.lang.System.out.println("What y coordinate?");
    y = playerInput.HumanInput.replaceLaterScanner.nextInt();
    java.lang.System.out.println(((printCoords()) + "Thank you!"));
    java.awt.Point xAndy = new java.awt.Point(x, y);
    return xAndy;
}
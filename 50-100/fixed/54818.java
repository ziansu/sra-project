public static void main(java.lang.String[] args) {
    int width = 12;
    int length = 10;
    int height = 8;
    FixDebugBox box1 = new DebugBox();
    FixDebugBox box2 = new DebugBox(width, length, height);
    java.lang.System.out.println("The dimensions of the first box are");
    box1.showData();
    java.lang.System.out.print("  The volume of the first box is ");
    box1.showVolume();
    java.lang.System.out.println("The dimensions of the second box are");
    box2.showData();
    java.lang.System.out.print("  The volume of the second box is ");
    box2.showVolume();
}
public int totalChildren(java.util.Scanner in, int maxOcc) {
    java.lang.System.out.println("=======================================================================================================");
    java.lang.System.out.println(("Room occupancy left is " + maxOcc));
    java.lang.System.out.println("How many Children will be staying?");
    int children = in.nextInt();
    while (children > maxOcc) {
        java.lang.System.out.println("Error: Sorry that many people exceed the room occupancy. Please try again.");
        children = in.nextInt();
    } 
    return children;
}
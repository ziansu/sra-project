public int totalChildren(java.util.Scanner in, int maxOcc) {
    int children = 0;
    do {
        java.lang.System.out.println("=======================================================================================================");
        java.lang.System.out.println(("Room occupancy left is " + maxOcc));
        java.lang.System.out.println("How many Children will be staying?");
        java.lang.System.out.println("=======================================================================================================");
        children = in.nextInt();
        if (children > maxOcc) {
            java.lang.System.out.println("=======================================================================================================");
            java.lang.System.out.println("Error: Sorry that many people exceed the room occupancy. Please try again.");
        }
    } while (children > maxOcc );
    return children;
}
protected static java.lang.String getRoomName(java.util.ArrayList<main.java.com.marist.mscs721.Room> rooms) {
    boolean inputCheck = false;
    java.lang.String test = "";
    while (!inputCheck) {
        java.lang.System.out.println("Room Name?");
        test = main.java.com.marist.mscs721.RoomScheduler.keyboard.next();
        java.lang.System.out.println(main.java.com.marist.mscs721.RoomScheduler.findRoomIndex(rooms, test));
        if ((main.java.com.marist.mscs721.RoomScheduler.findRoomIndex(rooms, test)) == (-1)) {
            java.lang.System.out.println("ERROR: Invalid room. Please input a room that is on the room list.");
        }else {
            inputCheck = true;
        }
    } 
    return test;
}
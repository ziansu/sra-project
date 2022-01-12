public static void connect(java.lang.String port, main.core.RoombaStartMode startMode) {
    main.core.RoombaJSSCSingleton.roombaJSSC.connect(port);
    main.core.RoombaJSSCSingleton.roombaJSSC.start();
    switch (startMode) {
        case FULL :
            main.core.RoombaJSSCSingleton.roombaJSSC.fullMode();
            break;
        case SAFE :
            main.core.RoombaJSSCSingleton.roombaJSSC.safeMode();
            break;
        default :
            break;
    }
    main.core.RoombaJSSCSingleton.isConnected.set(true);
}
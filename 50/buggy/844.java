public static void removeProceedingOfRoom(java.lang.Long room) {
    new com.activeandroid.query.Delete().from(com.example.houserental.function.model.ProceedingDAO.class).where("room = ?", room).executeSingle();
}
private void amountOfRooms() {
    java.lang.String rooms = properties.get("Liczba pokoi");
    if (rooms == null) {
        adBuilder.rooms(null);
    }else
        if (rooms.equals("Kawalerka")) {
            adBuilder.rooms(1);
        }else {
            adBuilder.rooms(java.lang.Character.getNumericValue(rooms.charAt(0)));
        }
    
}
private void amountOfRooms() {
    java.lang.String rooms = properties.get("Liczba pokoi");
    if (rooms == null) {
        adBuilder.rooms(null);
    }
    if (rooms.equals("Kawalerka")) {
        adBuilder.rooms(1);
    }
    adBuilder.rooms(java.lang.Character.getNumericValue(rooms.charAt(0)));
}
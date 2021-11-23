public com.hotelbeds.distribution.hotel_api_sdk.helpers.AvailRoom.AvailRoomBuilder adultOf(int age) {
    detail(new com.hotelbeds.distribution.hotel_api_sdk.helpers.RoomDetail(com.hotelbeds.distribution.hotel_api_sdk.helpers.RoomDetail.GuestType.ADULT, age, null, null));
    return this;
}
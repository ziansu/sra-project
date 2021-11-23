public com.spontaneous.server.model.entity.Event createEvent(com.spontaneous.server.model.request.CreateEventRequest createEventRequest) {
    com.spontaneous.server.model.entity.Event event = new com.spontaneous.server.model.entity.Event.Builder().title(createEventRequest.getTitle()).description(createEventRequest.getDescription()).date(createEventRequest.getDate()).location(createEventRequest.getLocation()).host(mUserRepository.findOne(createEventRequest.getHostUserId())).build();
    inviteUsers(createEventRequest.getInvitedUsers(), event);
    return mEventRepository.save(event);
}
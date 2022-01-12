public java.util.List<com.lrazvan.business.dto.EventDTO> findByName(java.lang.String name) {
    java.util.List<com.lrazvan.business.dto.EventDTO> eventDTOList = new java.util.ArrayList<>();
    java.util.List<com.lrazvan.data.entity.Event> eventList = eventRepository.findByName(name);
    java.lang.Double startingPrice;
    com.lrazvan.business.dto.EventDTO eventDTO;
    for (com.lrazvan.data.entity.Event event : eventList) {
        startingPrice = computeStartingPrice(event);
        eventDTO = com.lrazvan.business.utils.EntityUtils.eventToEventDTO(event);
        eventDTO.setStartingPrice(startingPrice);
        eventDTOList.add(com.lrazvan.business.utils.EntityUtils.eventToEventDTO(event));
    }
    return eventDTOList;
}
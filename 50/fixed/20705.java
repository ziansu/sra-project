@de.frankhasenbalg.Events.RequestMapping(value = "/modify", method = RequestMethod.POST)
public java.util.List<de.frankhasenbalg.Events.Event> modify(@de.frankhasenbalg.Events.RequestBody
de.frankhasenbalg.Events.Event event) {
    eventRepository.save(event);
    return eventRepository.findAllByOrderByDateAsc();
}
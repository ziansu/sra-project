public void removeCalendarEventProvider(org.wilson.world.festival.CalendarEventProvider provider) {
    if ((provider != null) && ((provider.getName()) != null)) {
        this.providers.remove(provider.getName(), provider);
    }
}
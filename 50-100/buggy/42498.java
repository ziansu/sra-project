@java.lang.Override
public void handlePacket(net.minecraft.entity.player.EntityPlayer player) {
    joshie.harvest.api.calendar.CalendarDate date = HFApi.calendar.getDate(player.worldObj);
    joshie.harvest.api.calendar.Season previous = date.getSeason();
    date.setWeekday(weekday).setDay(day).setSeason(season).setYear(year);
    joshie.harvest.api.calendar.CalendarDate.DAYS_PER_SEASON = daysPerSeason;
    if (previous != (season)) {
        joshie.harvest.core.handlers.HFTrackers.getCalendar(player.worldObj).onSeasonChanged();
        joshie.harvest.core.helpers.MCClientHelper.refresh();
    }
}
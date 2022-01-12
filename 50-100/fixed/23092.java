@java.lang.Override
public com.example.mm.model.Meeting updateMeeting(java.lang.Long meeting_id, java.lang.String title, com.example.mm.model.categories.ActivityCategory ac, java.time.LocalDate date, java.time.LocalTime timeFrom, java.time.LocalTime timeTo) {
    com.example.mm.model.Meeting meeting = meetingRepositoryCrud.findOne(meeting_id);
    if (title != null)
        meeting.title = title;
    
    if (ac != null)
        meeting.activityCategory = ac;
    
    if (date != null)
        meeting.date = date;
    
    if (timeFrom != null)
        meeting.timeFrom = timeFrom;
    
    if (timeTo != null)
        meeting.timeTo = timeTo;
    
    return meetingRepositoryCrud.save(meeting);
}
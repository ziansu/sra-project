private boolean isValidDescription(com.softserve.edu.schedule.dto.MeetingDTO meetingDTO) {
    return ((meetingDTO.getDescription()) == null) || (meetingDTO.getDescription().matches(ValidationCriteria.PATTERN_FOR_MEETING_DESCRIPTION));
}
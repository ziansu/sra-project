private void newTimeButtonActionPerformed() {
    GUI.SubjectsPanel.ChaosMode.MeetingTime meetingTime = new GUI.SubjectsPanel.ChaosMode.MeetingTime(this.meetingType, this);
    meetings.add(meetingTime);
    this.addMeetingToGUI(meetingTime);
}
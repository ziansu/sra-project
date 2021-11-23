public void editLecture(application.Lecture lecture) {
    courseID = lecture.getCourseID();
    lectureID = lecture.getLectureID();
    popupTitle.setText("Edit lecture");
    popupTopText.setText("Topic number");
    popupTopInput.setText(lecture.getlectureNumber());
    popupTopInput.setPromptText("Lecture number");
    popupBotText.setText("Topic name");
    popupBotInput.setText(lecture.getlectureName());
    popupBotInput.setPromptText("Lecture name");
}
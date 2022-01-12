public void editLecture(application.Lecture lecture) {
    courseID = lecture.getCourseID();
    lectureID = lecture.getLectureID();
    popupTitle.setText("Edit lecture");
    popupTopText.setText("Lecture number");
    popupTopInput.setText(lecture.getlectureNumber());
    popupTopInput.setPromptText("Lecture number");
    popupBotText.setText("Lecture name");
    popupBotInput.setText(lecture.getlectureName());
    popupBotInput.setPromptText("Lecture name");
}
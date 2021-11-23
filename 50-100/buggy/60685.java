@java.lang.Override
public void onSuccess(java.util.List<com.ncjavaedu.ediary.client.model.LectureDTO> lectures) {
    onGetLectures(lectures);
    timeTable.add(new com.ncjavaedu.ediary.client.schedule.Schedule(lectures));
    lecturesStore.replaceAll(lectures);
    lecturesGrid.getView().refresh(true);
    lecturesGrid.reconfigure(lecturesGrid.getStore(), lecturesGrid.getColumnModel());
}
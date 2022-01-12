@java.lang.Override
public void onSuccess(java.util.List<com.ncjavaedu.ediary.client.model.LectureDTO> lectures) {
    onGetLectures(lectures);
    lecturesStore.replaceAll(lectures);
    lecturesGrid.getView().refresh(true);
    lecturesGrid.reconfigure(lecturesGrid.getStore(), lecturesGrid.getColumnModel());
}
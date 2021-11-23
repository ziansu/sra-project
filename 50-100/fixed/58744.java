@android.support.annotation.NonNull
private android.content.ContentValues getStudentContentValues(com.example.play.yuri.agenda.model.Student student) {
    android.content.ContentValues datas = new android.content.ContentValues();
    datas.put("name", student.getName());
    datas.put("address", student.getAddress());
    datas.put("phone", student.getPhone());
    datas.put("site", student.getSite());
    datas.put("rating", student.getRating());
    datas.put("photo_path", student.getPhotoPath());
    return datas;
}
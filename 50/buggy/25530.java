public void updateData(java.util.List data, java.util.List<java.util.List<com.example.lzl.mycardstack.LessonData>> lessonList) {
    this.lessonList = lessonList;
    this.setData(data);
    this.notifyDataSetChanged();
    java.lang.System.out.println("Updata!");
}
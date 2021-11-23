public java.util.List<com.YCPCS.Whiteboard.Model.Lecture> getAllUserLectures(int userId) {
    java.util.List<com.YCPCS.Whiteboard.Model.Relationship> rels = com.YCPCS.Whiteboard.Database.DatabaseProvider.getInstance().getTarget("user", "lecture", userId);
    java.util.List<com.YCPCS.Whiteboard.Model.Lecture> lectures = new java.util.ArrayList<com.YCPCS.Whiteboard.Model.Lecture>();
    if (rels != null) {
        for (com.YCPCS.Whiteboard.Model.Relationship rel : rels) {
            lectures.add(getLectureFromId(rel.getTargetId()));
        }
    }
    return lectures;
}
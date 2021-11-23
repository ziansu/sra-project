public void updateSubtopic(com.bam.bean.Subtopic subtopic) {
    java.lang.Long newDate = (subtopic.getSubtopicDate().getTime()) + 46800000;
    subtopic.setSubtopicDate(new java.sql.Timestamp(newDate));
    subtopicRepository.save(subtopic);
}
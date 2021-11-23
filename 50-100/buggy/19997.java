public com.hjwylde.rivers.db.models.SectionDocument.Builder copy(@android.support.annotation.NonNull
com.hjwylde.rivers.models.Section.Builder builder) {
    id(builder.id());
    subtitle(builder.subtitle());
    description(builder.description());
    putIn(builder.putIn());
    imageId(builder.imageId());
    grade(builder.grade());
    length(builder.length());
    duration(builder.duration());
    return this;
}
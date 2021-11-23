@java.lang.Override
public com.dpu.entity.Trailer add(com.dpu.entity.Trailer trailer) {
    trailer.setReadingTakenDate(new java.util.Date());
    trailer.setCreatedOn(new java.util.Date());
    trailer.setModifiedOn(new java.util.Date());
    return trailerdao.save(trailer);
}
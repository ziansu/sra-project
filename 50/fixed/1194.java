@java.lang.Override
public com.dpu.entity.Trailer add(com.dpu.entity.Trailer trailer) {
    return trailerdao.save(trailer);
}
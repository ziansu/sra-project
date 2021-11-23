public application.entity.GCurveModel findCurveByDate(java.lang.String date) {
    application.entity.GCurveModel result = repository.findCurveByDate(date);
    return result;
}
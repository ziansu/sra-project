@java.lang.Override
public java.lang.Long getDBValue(java.util.Calendar model) {
    return model == null ? null : model.getTimeInMillis();
}
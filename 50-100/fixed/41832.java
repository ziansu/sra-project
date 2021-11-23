private com.witt.tracker.entities.Progress createNewProgress(com.witt.tracker.response.Option option, com.witt.tracker.response.ReturnCategory category, java.lang.Integer userId, java.lang.String updated) {
    com.witt.tracker.entities.Progress prog = new com.witt.tracker.entities.Progress();
    prog.setActual(option.getCount());
    prog.setFoodid(category.getId());
    prog.setId(option.getId());
    prog.setUserid(userId);
    prog.setUpdated(updated);
    return prog;
}
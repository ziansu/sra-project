public se.kebnekaise.java.spring.model.WorkItem createOrUpdateWorkItem(se.kebnekaise.java.spring.model.WorkItem work) {
    try {
        se.kebnekaise.java.spring.model.WorkItem result = new se.kebnekaise.java.spring.model.WorkItem(work.getTitle(), work.getDescription(), work.getStatus());
        if ((result.getTitle().isEmpty()) || (result.getDescription().isEmpty())) {
            return null;
        }
        return workRepository.save(result);
    } catch (java.lang.NullPointerException e) {
        return null;
    }
}
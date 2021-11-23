public issuetracking.Sprint getSprintById(int sprintid) {
    issuetracking.Sprint toReturn = em.find(issuetracking.Sprint.class, sprintid);
    em.refresh(toReturn);
    return toReturn;
}
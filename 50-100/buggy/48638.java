public void setInitModel(org.springframework.ui.Model model, java.lang.String email) {
    model.addAttribute("user", userDao.getByEmail(email));
    java.util.List<candrun.model.GoalRelation> goalRelations = goalService.getGoalRelations(email);
    model.addAttribute("goalRelations", goalRelations);
    model.addAttribute("tasks", taskDao.getTasksByGoalId(goalRelations.get(0).getMyGoal().getId()));
}
public void createNewTrainingEmailNotificationForAdmins(org.exadel.training.model.Training training) {
    org.thymeleaf.context.Context context = new org.thymeleaf.context.Context();
    java.util.List<org.exadel.training.model.User> users = userService.getUsersByRole("admin");
    for (org.exadel.training.model.User user : users) {
        context.setVariable("mailReceiver", user.getFirstName());
        context.setVariable("typeTraining", "New training created: ");
        context.setVariable("nameTraining", training.getTitle());
        emailNotifierService.sendEmailNotification(user.getEmail(), "New training", context);
    }
}
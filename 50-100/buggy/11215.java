public models.Trainer searchTrainersByEmail(java.lang.String emailEntered) {
    java.lang.String searchByMail = new java.lang.String("");
    if ((trainers.size()) > 0) {
        for (models.Trainer trainer : trainers) {
            if (emailEntered.equals(trainer.getEmail())) {
                return trainer;
            }else {
                return null;
            }
        }
    }else {
        return null;
    }
    return null;
}
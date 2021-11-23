private void extractContributingPlans(edu.wpi.cetask.Plan plan) {
    if (plan.isPrimitive()) {
        contributingPlans.add(plan);
    }else {
        for (edu.wpi.cetask.Plan child : plan.getChildren())
            extractContributingPlans(child);
        
    }
}
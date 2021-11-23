@java.lang.Override
public void notifyBeforeMobsim(org.matsim.core.controler.events.BeforeMobsimEvent event) {
    for (org.matsim.api.core.v01.population.Person person : scenario.getPopulation().getPersons().values()) {
        for (java.lang.String mode : this.modes) {
            this.mode2calibrator.get(mode).addToDemand(plansTranslator.getCadytsPlan(person.getSelectedPlan()));
            this.mode2calibrator.get(mode).addToDemand(plansTranslator.getCadytsPlan(person.getSelectedPlan()));
        }
    }
}
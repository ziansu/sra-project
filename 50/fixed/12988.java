public stratos.game.plans.Plan copyFor(stratos.game.plans.Actor other) {
    if ((sickbay) == null)
        sickbay = findRefuge(actor);
    
    return new stratos.game.plans.FirstAid(other, patient, sickbay);
}
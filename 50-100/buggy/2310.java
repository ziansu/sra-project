@java.lang.Override
public void decreaseDuration() {
    this.duration -= 1;
    if ((this.duration) == 4) {
        affected.currentCombat.getTurnOrder().add(affected);
        java.lang.String message;
        if (this.affected.getProfession().equals("Monster")) {
            message = ("The " + (affected.getRace())) + " shatters the ice and joins the fray!";
        }else {
            message = (affected.getName()) + " shatters the ice and joins the fray!";
        }
    }
}
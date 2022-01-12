public void calculateFlexAndOvertime() {
    float flex = ((getTotalHours()) < 40) ? 40 - (getTotalHours()) : 0;
    float over = ((getTotalHours()) > 40) ? (getTotalHours()) - 40 : 0;
    setFlextime(flex);
    setOvertime(over);
}
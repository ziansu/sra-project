public void calculateFlexAndOvertime() {
    float flex = 40 - (getTotalHours());
    float over = ((getTotalHours()) > 40) ? (getTotalHours()) - 40 : 0;
    setFlextime(flex);
    setOvertime(over);
}
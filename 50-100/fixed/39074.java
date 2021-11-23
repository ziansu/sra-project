public void sickDay(java.lang.String ans) {
    if (ans == "stay home") {
        time += 24;
        setGrade(((getGrade()) - 20));
        setEnergy(100);
        setStress(((getStress()) - 10));
    }
}
public static void backUpLevel() {
    if (((com.DAA.Driver.jobsChosen) == 1) && ((com.DAA.Driver.currentCombo[0]) == ((com.DAA.Driver.numPeople) - 1))) {
        com.DAA.Driver.done = true;
        return ;
    }
    if ((com.DAA.Driver.jobsChosen) > 1) {
        com.DAA.Driver.currentCombo[((com.DAA.Driver.jobsChosen) - 1)] = 0;
        (com.DAA.Driver.currentCombo[((com.DAA.Driver.jobsChosen) - 2)])++;
    }else {
        (com.DAA.Driver.currentCombo[0])++;
    }
    (com.DAA.Driver.jobsChosen)--;
}
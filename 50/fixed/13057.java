public void addPerson() {
    try {
        com.ru.usty.elevator.Floor.personCountMutex.acquire();
        (personCount)++;
        com.ru.usty.elevator.Floor.personCountMutex.release();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
}
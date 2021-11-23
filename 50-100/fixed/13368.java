public void doTask(java.util.List<com.allirey.Soldier> list) {
    switch (this) {
        case ONE :
            taskOne(list, value);
            break;
        case TWO :
            taskTwo(list, value);
            break;
        case THREE :
            taskThree(list, value);
            break;
    }
}
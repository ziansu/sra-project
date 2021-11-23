public void doTask(java.util.List<com.allirey.Soldier> list) {
    switch (this) {
        case ONE :
            com.allirey.Task.taskOne(list, value);
            break;
        case TWO :
            com.allirey.Task.taskTwo(list, value);
            break;
        case THREE :
            com.allirey.Task.taskThree(list, value);
            break;
    }
}
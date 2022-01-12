public static int convertTime(int time, int duration) {
    int temp = 0;
    if (((time % 100) + duration) > 60) {
        temp = duration - 60;
        time += 100 + temp;
    }else
        if (((time % 100) + duration) == 60)
            time = ((time + 100) / 100) * 100;
        else
            time += duration;
        
    
    return time;
}
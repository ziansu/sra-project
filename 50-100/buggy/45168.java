@java.lang.Override
public void updateThinking(float delta) {
    if ((!(moving)) && (!(waiting))) {
        if ((random.nextFloat()) < (CHANCE_WAIT)) {
            moving = true;
            move_current = 0.0F;
            move_time_random = random.nextFloat();
            direction = com.jacl.capstone.data.enums.Direction.values()[random.nextInt(4)];
        }else {
            waiting = true;
            wait_current = 0.0F;
            wait_time_random = random.nextFloat();
        }
    }
}
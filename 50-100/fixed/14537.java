private double convertSpeed(net.minecraft.entity.Entity entity) {
    double speed = ((train.common.api.Locomotive) (entity)).getCustomSpeed();
    if (train.common.core.handlers.ConfigHandler.REAL_TRAIN_SPEED) {
        speed /= 2;
    }else {
        speed /= 6;
    }
    speed /= 10;
    if ((speed > 0.912) && (((train.common.api.Locomotive) (entity)).isAttached)) {
        return 0.912;
    }
    return speed;
}
@java.lang.Override
public void onValueChanged(MopedDataType mopedDataType, int i) {
    switch (mopedDataType) {
        case THROTTLE :
            communicationsMediator.transmitData((((THROTTLE) + (REGEX)) + i), com_io.Direction.INTERNAL);
            break;
        case STEERING :
            communicationsMediator.transmitData((((STEER) + (REGEX)) + i), com_io.Direction.INTERNAL);
            break;
        default :
    }
}
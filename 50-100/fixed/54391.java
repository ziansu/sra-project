@java.lang.Override
public float getInterpolation(float input) {
    if (input < 0.5F) {
        return 0.5F * (1 - (out.getInterpolation((1 - (input * 2)))));
    }
    return 0.5F * (1 + (out.getInterpolation(((input * 2) - 1))));
}
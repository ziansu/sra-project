@java.lang.Override
public void setValues(com.trcolgrove.contours.contoursGame.Note target, int tweenType, float[] newValues) {
    switch (tweenType) {
        case com.trcolgrove.contours.accessors.NoteAccessor.RIPPLE_ALPHA :
            target.setRippleAlpha(((int) (newValues[0])));
        case com.trcolgrove.contours.accessors.NoteAccessor.RIPPLE_RADIUS :
            target.setRippleRadius(((int) (newValues[0])));
    }
}
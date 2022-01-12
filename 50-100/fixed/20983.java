public com.jenshen.awesomeanimation.AwesomeAnimation.Builder setY(@com.jenshen.awesomeanimation.AwesomeAnimation.CoordinationMode
java.lang.String mode, float... y) {
    if (mode.equals(com.jenshen.awesomeanimation.AwesomeAnimation.CoordinationMode.COORDINATES)) {
        objectAnimations.add(new com.jenshen.awesomeanimation.AwesomeAnimation.AnimationParams.Builder(android.view.View.Y, y).build());
    }else
        if (mode.equals(com.jenshen.awesomeanimation.AwesomeAnimation.CoordinationMode.TRANSITION)) {
            objectAnimations.add(new com.jenshen.awesomeanimation.AwesomeAnimation.AnimationParams.Builder(android.view.View.TRANSLATION_Y, y).build());
        }else {
            throw new java.lang.RuntimeException("Can't support this mode");
        }
    
    return this;
}
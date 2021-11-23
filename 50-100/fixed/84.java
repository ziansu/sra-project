public com.jenshen.awesomeanimation.AwesomeAnimation.Builder setX(@com.jenshen.awesomeanimation.AwesomeAnimation.CoordinationMode
java.lang.String mode, float... x) {
    if (mode.equals(com.jenshen.awesomeanimation.AwesomeAnimation.CoordinationMode.COORDINATES)) {
        objectAnimations.add(new com.jenshen.awesomeanimation.AwesomeAnimation.AnimationParams.Builder(android.view.View.X, x).build());
    }else
        if (mode.equals(com.jenshen.awesomeanimation.AwesomeAnimation.CoordinationMode.TRANSITION)) {
            objectAnimations.add(new com.jenshen.awesomeanimation.AwesomeAnimation.AnimationParams.Builder(android.view.View.TRANSLATION_X, x).build());
        }else {
            throw new java.lang.RuntimeException("Can't support this mode");
        }
    
    return this;
}
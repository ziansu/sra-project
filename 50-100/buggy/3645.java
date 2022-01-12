@java.lang.Override
public com.claymus.commons.shared.UserState getState() {
    if ((state) != null)
        return state;
    
    switch (status) {
        case PRELAUNCH_REFERRAL :
        case POSTLAUNCH_REFERRAL :
            return com.claymus.commons.shared.UserState.REFERRAL;
        case PRELAUNCH_SIGNUP :
        case POSTLAUNCH_SIGNUP :
        case POSTLAUNCH_SIGNUP_SOCIALLOGIN :
        case ANDROID_SIGNUP :
        case ANDROID_SIGNUP_FACEBOOK :
        case ANDROID_SIGNUP_GOOGLE :
            return com.claymus.commons.shared.UserState.REGISTERED;
    }
    return com.claymus.commons.shared.UserState.REGISTERED;
}
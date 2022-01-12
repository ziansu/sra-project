public static void startFirebasePhoneAuth(android.content.Context context, xyz.belvi.baseauth_firebase.callbacks.FirebaseAuthListener authListener, @android.support.annotation.StyleRes
int styleRes) {
    xyz.belvi.baseauth_firebase.auth.AuthHandler.init(authListener);
    context.startActivity(new android.content.Intent(context, xyz.belvi.baseauth_firebase.auth.FireAuthActivity.class).putExtra(xyz.belvi.baseauth_firebase.auth.STYLE_KEY, styleRes).putExtra(xyz.belvi.baseauth_firebase.auth.CODE_LENGTH, FirebaseAuthListener.AUTH_CODE_LENGTH).putExtra(xyz.belvi.baseauth_firebase.auth.AUTH_MODE_KEY, AUTH_MODE.FIRE_BASE));
}
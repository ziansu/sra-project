private void handleSignInWithFacebook(io.flutter.plugin.common.MethodCall call, final io.flutter.plugin.common.MethodChannel.Result result) {
    @java.lang.SuppressWarnings(value = "unchecked")
    java.util.Map<java.lang.String, java.lang.String> arguments = ((java.util.Map<java.lang.String, java.lang.String>) (call.arguments));
    java.lang.String tokenString = arguments.get("accessToken");
    com.google.firebase.auth.AuthCredential credential = io.flutter.firebaseauth.FacebookAuthProvider.getCredential(accessToken);
    firebaseAuth.signInWithCredential(credential).addOnCompleteListener(activity, new io.flutter.firebaseauth.FirebaseAuthPlugin.SignInCompleteListener(result));
}
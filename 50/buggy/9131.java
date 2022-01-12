@org.robovm.pods.facebook.login.Method(selector = "logInWithPublishPermissions:handler:")
public native void logInWithPublishPermissions(@org.robovm.pods.facebook.login.Marshaler(value = NSSet.AsStringSetMarshaler.class)
java.util.Set<java.lang.String> permissions, @org.robovm.pods.facebook.login.Block
org.robovm.pods.facebook.login.VoidBlock2<org.robovm.pods.facebook.login.FBSDKLoginManagerLoginResult, org.robovm.pods.facebook.login.NSError> handler);
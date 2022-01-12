@com.facebook.react.bridge.ReactMethod
public void setUser(com.facebook.react.bridge.ReadableMap user) {
    if (((user.hasKey("email")) && (user.getString("userID"))) && (user.getString("username"))) {
        io.sentry.Sentry.setUser(new io.sentry.event.UserBuilder().setEmail(user.getString("email")).setId(user.getString("userID")).setUsername(user.getString("username")).build());
    }
}
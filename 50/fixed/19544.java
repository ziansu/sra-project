@java.lang.Override
public void onCreate() {
    super.onCreate();
    firebaseRef = new com.firebase.client.Firebase(com.example.khumalo.appui.Utils.Constants.FIREBASE_ROUTES_URL);
}
public static com.example.johnta.homeworkappv2.firebase.FirebaseWrapper getInstance(android.content.Context context) {
    if ((com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance) == null)
        com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance = new com.example.johnta.homeworkappv2.firebase.FirebaseWrapper(context);
    
    com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance.setContext(context);
    return com.example.johnta.homeworkappv2.firebase.FirebaseWrapper.instance;
}
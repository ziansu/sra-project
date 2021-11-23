@com.google.firebase.database.Exclude
public java.util.Map<java.lang.String, java.lang.Object> toMap() {
    java.util.HashMap<java.lang.String, java.lang.Object> result = new java.util.HashMap<>();
    result.put("username", username);
    result.put("email", email);
    result.put("message", message);
    result.put("timeStamp", timeStamp);
    result.put("downloadURL", downloadURL);
    return result;
}
@com.google.firebase.database.Exclude
public java.util.Map<java.lang.String, java.lang.Object> toMap() {
    java.util.HashMap<java.lang.String, java.lang.Object> result = new java.util.HashMap<>();
    result.put("uID", uID);
    result.put("first name", firstName);
    result.put("last name", lastName);
    return result;
}
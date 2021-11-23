public java.util.Map toMap() {
    java.util.Map result = new java.util.HashMap<>();
    result.put("id", getId());
    result.put("email", getEmail());
    result.put("mobilePhone", getMobilePhone());
    result.put("role", roles);
    return result;
}
@org.hibernate.validator.constraints.NotBlank
public java.lang.String getAuthTokenString() {
    if (!(headers.containsKey("Authorization"))) {
        return null;
    }
    return headers.get("Authorization").toString().replace("Bearer ", "");
}
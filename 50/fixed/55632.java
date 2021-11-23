@java.lang.Override
public org.springframework.http.ResponseEntity<java.lang.String> assignLicensesToUser(java.lang.String customerId, java.lang.String userId, org.springframework.social.partnercenter.api.customer.user.request.AssignLicensesToUserRequest request) {
    return restResource.request().pathSegment(customerId, "users", userId, "licenseupdates").post(request, java.lang.String.class);
}
@java.lang.Override
public com.aristotle.core.persistance.User registerOnlineMember(java.lang.Long loggedInUserId, java.lang.String mobileNumber, java.lang.String name, java.lang.String amount, java.lang.String paymentMode, java.lang.String transactionId, java.lang.String fees) throws com.aristotle.core.exception.AppException {
    com.aristotle.core.persistance.User user = userRepository.findOne(loggedInUserId);
    createUserMembership(user, "Online", transactionId, fees);
    return user;
}
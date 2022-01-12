@java.lang.Override
public com.diary.calendar.domains.User getUserByUserId(final java.lang.Long userId) {
    return userRepository.findOne(userId);
}
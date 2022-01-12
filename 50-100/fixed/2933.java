@org.springframework.transaction.annotation.Transactional
@java.lang.Override
public com.netease.commons.ApiResponse createNewUser(com.netease.model.User user) {
    if ((user.getAdmin()) == null) {
        user.setAdmin(0);
    }
    com.netease.commons.ApiResponse response = com.netease.commons.ApiResponse.createDefaultApiResponse();
    com.netease.model.User u = userRepository.findByAccountId(user.getAccountId());
    if (u != null) {
        response.setRetCode(300);
        response.setRetDesc("账号已经存在");
    }else {
        userRepository.save(user);
    }
    return response;
}
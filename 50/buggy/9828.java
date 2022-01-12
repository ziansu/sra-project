private boolean ifUserGroupKey(com.deloitte.smt.dto.SearchDto searchDto) {
    boolean isUserGroupKey = false;
    if (!(org.springframework.util.CollectionUtils.isEmpty(searchDto.getUserGroupKeys()))) {
        isUserGroupKey = true;
    }
    return isUserGroupKey;
}
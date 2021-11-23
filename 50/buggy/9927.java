public boolean doesNickNameExist(java.lang.String nickName) {
    if (nickNames.containsKey(nickName))
        return false;
    
    return true;
}
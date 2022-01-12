@java.lang.Override
public java.util.List<sparepartsEJBClient.dtos.UserDTO> getAllUsers() {
    java.util.List<sparepartsEJBClient.dtos.UserDTO> userDTOList = new java.util.ArrayList<>();
    java.util.List<model.User> userList = userDAO.getAllUsers();
    if (null != userList) {
        for (model.User user : userList) {
            userDTOList.add(userAssembler.userToDto(user));
        }
        return userDTOList;
    }else {
        return null;
    }
}
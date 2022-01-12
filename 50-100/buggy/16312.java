@java.lang.Override
public void update(com.luxoft.wheretogo.models.User user) {
    if (!(user.getPicture().equals(""))) {
        if (user.getPicture().substring(0, 4).equals("data")) {
            user.setPicture(com.luxoft.wheretogo.utils.ImageUtils.generatePicturePath(user.getPicture(), com.luxoft.wheretogo.utils.PropertiesUtils.getProp("users.images.path")));
            com.luxoft.wheretogo.utils.ImageUtils.deleteOldPicture(user.getPicture());
        }
    }
    usersRepository.update(user);
}
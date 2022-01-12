@org.springframework.web.bind.annotation.RequestMapping(value = "/list", method = org.springframework.web.bind.annotation.RequestMethod.GET)
public java.util.ArrayList<be.ehb.restservermetdatabase.model.Avatar> list(@org.springframework.web.bind.annotation.RequestParam(value = "user_id", defaultValue = "")
int user_id, @org.springframework.web.bind.annotation.RequestParam(value = "user_id", defaultValue = "")
java.lang.String user_mail) {
    if ((user_id == 0) && (user_mail.equals(""))) {
        return be.ehb.restservermetdatabase.dao.AvatarDao.getAvatars();
    }else
        if (!(user_mail.equals(""))) {
            user_id = be.ehb.restservermetdatabase.dao.UserDao.getUserByEmail(user_mail).getUser_id();
            return be.ehb.restservermetdatabase.dao.AvatarDao.getAvatarsByUser(user_id);
        }else {
            return null;
        }
    
}
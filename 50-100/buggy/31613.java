@java.lang.Override
public void done(com.parse.ParseObject object, com.parse.ParseException e) {
    if (e == null) {
        com.clothapp.profile.utils.ProfileUtils.persona = object;
        long age = com.clothapp.profile.utils.ProfileUtils.getAge(com.clothapp.profile.utils.ProfileUtils.persona.get("date").toString());
        if (age < 0)
            com.clothapp.profile.utils.ProfileUtils.updateListItem(1, "Not found");
        else
            com.clothapp.profile.utils.ProfileUtils.updateListItem(1, (age + " years old"));
        
        com.clothapp.profile.utils.ProfileUtils.updateListItem(2, com.clothapp.profile.utils.ProfileUtils.persona.get("city").toString());
    }else {
        e.printStackTrace();
    }
}
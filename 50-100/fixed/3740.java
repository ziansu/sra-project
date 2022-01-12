public void RemoveUser(UserProfile user) {
    if ((first) == user) {
        UserProfile temp = first.NextUser;
        first.NextUser = null;
        first = temp;
    }else {
        UserProfile currentuser = first;
        while ((currentuser.NextUser) != user) {
            currentuser = currentuser.NextUser;
        } 
        currentuser.NextUser = currentuser.NextUser.NextUser;
    }
}
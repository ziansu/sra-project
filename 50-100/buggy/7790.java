public java.lang.String inviteUserToBooking(java.lang.String username_to_invite, int booking_id) throws java.sql.SQLException {
    java.sql.PreparedStatement s1 = connection.prepareStatement("SELECT systemUserId FROM SystemUser WHERE username=?");
    s1.setString(1, username_to_invite);
    java.sql.ResultSet result = s1.executeQuery();
    if (result.next())
        inviteUserToBooking(result.getInt(1), booking_id);
    
    if (result.next())
        return inviteUserToBooking(result.getInt(1), booking_id);
    
    return ("No such user found '" + username_to_invite) + "'.";
}
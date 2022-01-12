private void createRandomBountyPlayer(java.sql.Connection connection) {
    try {
        java.sql.Statement create = connection.createStatement();
        java.sql.ResultSet rs = create.executeQuery("SELECT PLAYER_ID from mh_Players WHERE NAME='RandomBounty' LIMIT 0");
        if (!(rs.next())) {
            java.lang.System.out.println("[MobHunting] Adding RandomBounty Player to MobHunting Database.");
            create.executeUpdate("insert into mh_Players (UUID,NAME,PLAYER_ID,LEARNING_MODE,MUTE_MODE) values (null,'RandomBounty',0,0,0)");
            create.executeUpdate("update mh_Players set Player_id=0 where name='RandomBounty'");
        }
        rs.close();
    } catch (java.sql.SQLException e) {
        e.printStackTrace();
    }
}
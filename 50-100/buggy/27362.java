public void createMusicFolder(org.libresonic.player.domain.MusicFolder musicFolder) {
    java.lang.String sql = ("insert into music_folder (" + (org.libresonic.player.dao.MusicFolderDao.INSERT_COLUMNS)) + ") values (?, ?, ?, ?)";
    update(sql, musicFolder.getPath(), musicFolder.getName(), musicFolder.isEnabled(), musicFolder.getChanged());
    java.lang.Integer id = queryForInt("select max(id) from music_folder", 0);
    update(("insert into music_folder_user (music_folder_id, username) select ?, username from " + (userDao.getUserTable())), id);
    org.libresonic.player.dao.MusicFolderDao.LOG.info(("Created music folder " + (musicFolder.getPath())));
}
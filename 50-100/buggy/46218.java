public java.util.List<pe.com.rc.mobile.model.Lugar> listarLugaresByDefault(java.lang.String distrito, java.util.List<pe.com.rc.mobile.model.TipoLugar> tipoLugar, java.util.List<pe.com.rc.mobile.model.MusicaLugar> musicaLugar, java.lang.String idUsuario) throws pe.com.rc.mobile.core.exception.DaoException {
    java.util.List<pe.com.rc.mobile.model.Lugar> lugares = new java.util.ArrayList(0);
    org.springframework.jdbc.core.JdbcTemplate jdbcTemplate = new org.springframework.jdbc.core.JdbcTemplate(dataSource);
    lugarHelper = new pe.com.rc.mobile.dao.helper.LugarHelper(jdbcTemplate);
    java.lang.String tiposLugar = getTiposLugar(tipoLugar);
    java.lang.String musicasLugar = getMusicasLugar(musicaLugar);
    lugares = lugarHelper.getLugaresByDefault(distrito, tiposLugar, musicasLugar);
    return lugares;
}
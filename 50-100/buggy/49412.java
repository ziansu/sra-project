@org.junit.Test
public void debeRetornarLosRegistrosDeUnArchivo() {
    ec.gob.senescyt.carga.masiva.core.Archivo archivo = crearArchivo();
    ec.gob.senescyt.carga.masiva.dao.ArchivoDao archivoDao = new ec.gob.senescyt.carga.masiva.dao.ArchivoDao(sessionFactory, defaultSchema);
    archivoDao.guardar(archivo);
    ec.gob.senescyt.carga.masiva.dao.RegistroDao registroDao = new ec.gob.senescyt.carga.masiva.dao.RegistroDao(sessionFactory, defaultSchema);
    java.util.List<ec.gob.senescyt.carga.masiva.core.Registro> registrosActuales = registroDao.obtenerPorIdArchivo(archivo.getId());
    org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals(registrosActuales, archivo.getRegistros());
}
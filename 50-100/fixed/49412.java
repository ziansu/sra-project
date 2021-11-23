@org.junit.Test
public void debeRetornarLosRegistrosDeUnArchivo() {
    ec.gob.senescyt.carga.masiva.core.Archivo archivo = crearArchivo();
    archivoDao.guardar(archivo);
    java.util.List<ec.gob.senescyt.carga.masiva.core.Registro> registrosActuales = registroDao.obtenerPorIdArchivo(archivo.getId());
    org.unitils.reflectionassert.ReflectionAssert.assertReflectionEquals(registrosActuales, archivo.getRegistros());
}
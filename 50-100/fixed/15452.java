@org.junit.Test
public void createPlanta() throws java.lang.Exception {
    java.lang.String nombreComun = "Pehuen";
    java.lang.String nombreCientifico = "Araucaria araucana";
    java.lang.String familia = "Araucariaceae";
    java.lang.String descripcion = "El nombre del g�nero deriva de la regi�n de Arauco.";
    com.januz.atlas.PlantaDto planta = new com.januz.atlas.PlantaDto(nombreComun, nombreCientifico, familia, descripcion);
    dao.createPlanta(planta);
}